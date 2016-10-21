package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Facade;
import models.data.Item;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class RegisterPurchaseController extends Controller {

	private static Facade facade;
	
    public static Result register() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result purchase() {
    	facade = Facade.getInstance();
//    	facade.purchaseItem(new Item());
//    	List<Item> items = new ArrayList<>();
//    	Item item = new Item();
//    	item.value = 5;
//    	items.add(item);
    	List<Item> items = facade.getItens();
        return ok(views.html.purchase.render(items));
    }

}

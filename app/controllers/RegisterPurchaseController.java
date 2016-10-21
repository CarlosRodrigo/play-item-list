package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Facade;
import models.data.Item;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class RegisterPurchaseController extends Controller {

	private static Facade facade;
	
    public static Result register() {
        Form<Item> formItem = Form.form(Item.class);
        Form<Item> filled = formItem.bindFromRequest();
        Item item = filled.get();
        
        facade = Facade.getInstance();
        facade.purchaseItem(item);
        
        return redirect(routes.RegisterPurchaseController.purchase());
    }

    public static Result purchase() {
    	facade = Facade.getInstance();
    	List<Item> items = facade.getItens();
    	
    	Form<Item> form = Form.form(Item.class);
    	
        return ok(views.html.purchase.render(items, form));
    }

}

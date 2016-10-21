package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class RegisterPurchaseController extends Controller {

    public static Result register() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result purchases() {
        return ok(index.render("Your new application is ready."));
    }

}

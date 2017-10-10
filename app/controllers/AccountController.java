package controllers;

import models.Account;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.account.accountlist;

import java.util.ArrayList;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class AccountController extends Controller {


    private List<Account> accounts = new ArrayList(){{
        add(new Account(1,"Bruce"));
        add(new Account(2,"Shin"));
    }};


    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result list() {
        return ok(accountlist.render(accounts));
    }

}

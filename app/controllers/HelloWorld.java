package controllers;

import play.*;
import play.mvc.*;


public class HelloWorld extends Controller {

    public Result index(String name) {
        return ok("Hello " + name);
    }
}

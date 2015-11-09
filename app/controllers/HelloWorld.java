package controllers;

import play.*;
import play.mvc.*;


public class HelloWorld extends Controller {

    public Result index() {
        return ok("Hello World!");
    }
}

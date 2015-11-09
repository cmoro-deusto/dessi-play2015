package controllers;

import play.*;
import play.mvc.*;


public class HelloWorld extends Controller {

    public Result index(String name, int age) {
        return ok("Hello " + name + " you are " + age + " years old.");
    }
}

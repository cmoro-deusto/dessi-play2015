package controllers;

import play.*;
import play.mvc.*;


public class HelloWorld extends Controller {

    public Result index(String name, int age) {
        String location = Play.application().configuration().getString("location");
        return ok(views.html.hello.render(name, age, location));
    }
}

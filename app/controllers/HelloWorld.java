package controllers;

import play.*;
import play.mvc.*;

import java.util.ArrayList;
import java.util.List;


public class HelloWorld extends Controller {

    public Result index(String name, int age) {
        String location = Play.application().configuration().getString("location");
        List<String> array = new ArrayList<>();
        array.add("Elemento 1");
        array.add("Elemento 2");
        array.add("Elemento 3");
        array.add("Elemento 4");
        array.add("Elemento 5");

        return ok(views.html.hello.render(name, age, location, array));
    }
}

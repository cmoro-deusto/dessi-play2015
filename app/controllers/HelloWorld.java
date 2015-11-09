package controllers;

import com.mongodb.client.MongoIterable;
import modules.MongoModule;
import modules.MongoModuleImpl;
import play.*;
import play.mvc.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


public class HelloWorld extends Controller {

    @Inject
    MongoModuleImpl mongo;

    public Result index(String name, int age) {
        String location = Play.application().configuration().getString("location");
        List<String> array = new ArrayList<>();

        MongoIterable<String> iterable = mongo.mongo.listDatabaseNames();
        for (String s : iterable) {
            array.add(s);
        }

        return ok(views.html.hello.render(name, age, location, array));
    }
}

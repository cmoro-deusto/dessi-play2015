package controllers;

import com.mongodb.client.MongoIterable;
import models.User;
import modules.MongoModule;
import play.*;
import play.api.*;
import play.mvc.*;
import play.Configuration;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


public class HelloWorld extends Controller {

    @Inject
    MongoModule mongo;

    public Result index(String name, int age) {

        String location = Configuration.root().getString("location");

        List<String> array = new ArrayList<>();

        MongoIterable<String> iterable = mongo.mongo.listDatabaseNames();
        for (String s : iterable) {
            array.add(s);
        }

        User user = new User();
        user.name = "John";
        user.lastname = "Snow";
        user.username = "jsnow";
        user.pass = "iknownothing";
        mongo.ds.save(user);


        return ok(views.html.hello.render(name, age, location, array));
    }


}

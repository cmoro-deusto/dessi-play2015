package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value = "user", noClassnameStored = true)
public class User {

    @Id
    public ObjectId id;

    @Property
    public String name;
    @Property
    public String lastname;
    @Property
    public String username;
    @Property
    public String pass;

}

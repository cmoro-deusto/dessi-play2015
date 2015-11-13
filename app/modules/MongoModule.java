package modules;

import com.mongodb.MongoClient;
import play.Logger;

import javax.inject.Singleton;

@Singleton
public class MongoModule {

    public static MongoClient mongo;

    public MongoModule() {

        Logger.info("Connecting to mongo...");
        this.mongo = new MongoClient();

    }
}

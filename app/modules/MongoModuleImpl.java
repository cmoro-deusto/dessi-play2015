package modules;

import com.mongodb.MongoClient;
import play.Logger;

import javax.inject.Singleton;

@Singleton
public class MongoModuleImpl {

    public static MongoClient mongo;

    public MongoModuleImpl() {

        Logger.info("Connecting to mongo...");
        this.mongo = new MongoClient();

    }
}

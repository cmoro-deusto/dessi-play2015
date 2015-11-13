package modules;

import com.google.inject.Inject;
import com.mongodb.MongoClient;

import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import play.Logger;

import javax.inject.Singleton;

@Singleton
public class MongoModule {

    public MongoClient mongo;
    public Morphia morphia;
    public Datastore ds;


    @Inject
    public MongoModule(ConfigModule config) {

        Logger.info("Connecting to mongo...");

        MongoClientOptions options = MongoClientOptions.builder().connectionsPerHost(config.conns).build();
        ServerAddress server = new ServerAddress(config.host, config.port);
        mongo = new MongoClient(server, options);
        Logger.info("Connected to Mongo at " + server.toString());

        Logger.info("Starting Morphia Datastore...");
        morphia = new Morphia();
        ds = morphia.createDatastore(mongo, config.db);

        Logger.info("Datastore: " + config.db);
        ds.ensureIndexes();
        ds.ensureCaps();
    }
}

package modules;

import play.Configuration;
import play.Logger;

import javax.inject.Singleton;

@Singleton
public class ConfigModule {

    public static String host;
    public static Integer port;
    public static String db;
    public static Integer conns;


    public ConfigModule() {

        Logger.info("Reading configuration...");

        this.host = Configuration.root().getString("morphia.db.host");
        this.port = Configuration.root().getInt("morphia.db.port");
        this.db = Configuration.root().getString("morphia.db.name");
        this.conns = Configuration.root().getInt("morphia.db.conns");

    }

}

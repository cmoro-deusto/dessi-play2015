package modules;

import com.google.inject.AbstractModule;

public class MongoModuleBinding extends AbstractModule {

    @Override
    protected void configure() {
        bind(MongoModule.class);
    }
}

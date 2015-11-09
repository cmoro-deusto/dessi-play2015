package modules;

import com.google.inject.AbstractModule;

public class MongoModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MongoModuleImpl.class);
    }
}

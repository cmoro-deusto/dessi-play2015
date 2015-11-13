package modules;

import com.google.inject.AbstractModule;


public class ConfigModuleBinding extends AbstractModule {

    @Override
    protected void configure() {
        bind(ConfigModule.class);
    }
}


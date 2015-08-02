package tk.hongkailiu.test.app.guice.MyGuiceAppConfig;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * Created by hongkailiu on 2015-08-02.
 */
public class MyAppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyGuiceAppConfig.class).to(MyGuiceAppConfigImpl.class).in(Singleton.class);
    }
}

package tk.hongkailiu.test.app.guice.MyGuiceAppConfig;

import com.google.inject.Inject;

/**
 * Created by hongkailiu on 2015-08-02.
 */
public class SomeService {

    @Inject MyGuiceAppConfig config;

    public String getHostname(){
        return config.getHostname();
    }
}

package tk.hongkailiu.test.app.guice.MyGuiceAppConfig;

import com.google.inject.Inject;

/**
 * Created by hongkailiu on 2015-10-20.
 */
public class ClassA implements IClassA {
    int i = 3;

    @Inject MyGuiceAppConfig config;

    @Override public int getI() {
        return 6;
    }

    @Override public String getS() {
        return config.getHostname();
    }
}

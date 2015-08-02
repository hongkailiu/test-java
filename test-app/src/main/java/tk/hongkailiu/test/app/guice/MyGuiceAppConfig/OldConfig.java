package tk.hongkailiu.test.app.guice.MyGuiceAppConfig;

import com.google.inject.Inject;

/**
 * Created by hongkailiu on 2015-08-02.
 */
public class OldConfig {

    private static MyGuiceAppConfig config;

    @Inject
    public OldConfig(MyGuiceAppConfig config){
        this.config = config;
    }

    public static String hostname = config.getHostname();
    public static int port = config.getPort();
    public static boolean isBeta(){
        return config.isBeta();
    }

}

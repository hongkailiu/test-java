package tk.hongkailiu.test.app.guice.MyGuiceAppConfig;

/**
 * Created by hongkailiu on 2015-08-02.
 */
public class MyGuiceAppConfigImpl implements MyGuiceAppConfig {

    /* package */ final static String HOSTNAME_PROD = "prodHostname";
    /* package */ final static int PORT_PROD = 443;
    /* package */ final static String HOSTNAME_BETA = "betaHostname";
    /* package */ final static int PORT_BETA = 25;

    @Override public String getHostname() {
        return isBeta() ? HOSTNAME_BETA : HOSTNAME_PROD;
    }

    @Override public int getPort() {
        return isBeta() ? PORT_BETA : PORT_PROD;
    }

    @Override public boolean isBeta() {
        return AppUtil.isBeta();
    }
}

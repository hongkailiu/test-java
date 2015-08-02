package tk.hongkailiu.test.app.guice.MyGuiceAppConfig;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hongkailiu on 2015-08-02.
 */
public class SomeServiceTest {

    private SomeService unitUnderTest;

    @Before public void setup(){
        Injector injector = Guice.createInjector(new MyTestAppModule());
        unitUnderTest = injector.getInstance(SomeService.class);
    }

    @Test public void testGetHostname() throws Exception {
        Assert.assertEquals(unitUnderTest.getHostname(), MyGuiceAppConfigImpl.HOSTNAME_PROD);
    }
}

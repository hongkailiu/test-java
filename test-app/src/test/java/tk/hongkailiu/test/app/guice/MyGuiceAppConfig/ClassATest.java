package tk.hongkailiu.test.app.guice.MyGuiceAppConfig;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hongkailiu on 2015-10-20.
 */
public class ClassATest {

    IClassA o = new ClassA();

    @Test public void testGetI() throws Exception {
        Assert.assertEquals(3, o.i);
        Assert.assertEquals(6, o.getI());
    }
}

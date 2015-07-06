package tk.hongkailiu.test.app.rabbitmq.manymesssages;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by ehongka on 7/6/15.
 */
public class ReceiverIT {

    Receiver unitUnderTest = new Receiver();

    @Test public void test() throws Exception {
        unitUnderTest.start();
    }
}

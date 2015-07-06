package tk.hongkailiu.test.app.rabbitmq.manymesssages;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by ehongka on 7/6/15.
 */
public class SenderIT {

    Sender unitUnderTest = new Sender();

    @Test public void test() throws IOException, InterruptedException {
        unitUnderTest.start();
    }
}

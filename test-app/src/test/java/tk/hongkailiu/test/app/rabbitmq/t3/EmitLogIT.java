package tk.hongkailiu.test.app.rabbitmq.t3;

import org.junit.Test;

/**
 * Created by ehongka on 7/2/15.
 */
public class EmitLogIT {

    @Test public void testMain() throws Exception {
        EmitLog.main(new String[] {"1", "2", "3"});
    }
}

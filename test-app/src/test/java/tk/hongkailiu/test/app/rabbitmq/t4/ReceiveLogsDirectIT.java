package tk.hongkailiu.test.app.rabbitmq.t4;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by ehongka on 7/3/15.
 */
public class ReceiveLogsDirectIT {

    @Test public void testMain() throws Exception {
        String[] args = new String[]{"info", "warn", "error"};
        ReceiveLogsDirect.main(args);
    }
}

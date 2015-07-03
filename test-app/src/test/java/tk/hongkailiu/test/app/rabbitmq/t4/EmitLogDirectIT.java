package tk.hongkailiu.test.app.rabbitmq.t4;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by ehongka on 7/3/15.
 */
public class EmitLogDirectIT {

    @Test public void testMainInfo() throws Exception {
        String[] args = new String[]{"info"};
        EmitLogDirect.main(args);
    }
}

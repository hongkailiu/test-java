package tk.hongkailiu.test.app.rabbitmq.t5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by ehongka on 7/3/15.
 */
public class EmitLogTopicIT {

    @Test public void testMain() throws Exception {
        String[] args = new String[]{"kern.critical", "A critical kernel error"};
        // String[] args = new String[]{"333.critical", "A critical kernel error"};
        EmitLogTopic.main(args);
    }
}

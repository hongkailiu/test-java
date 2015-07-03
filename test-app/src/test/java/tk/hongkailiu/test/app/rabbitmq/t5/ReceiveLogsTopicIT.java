package tk.hongkailiu.test.app.rabbitmq.t5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by ehongka on 7/3/15.
 */
public class ReceiveLogsTopicIT {

    @Test public void testMainReceiveAll() throws Exception {
        String[] args = new String[]{"#"};
        ReceiveLogsTopic.main(args);
    }

    @Test public void testMainReceiveFacilityKern() throws Exception {
        String[] args = new String[]{"kern.*"};
        ReceiveLogsTopic.main(args);
    }

    @Test public void testMainReceiveFacilityKernAndCritical() throws Exception {
        String[] args = new String[]{"kern.*", "*.critical"};
        ReceiveLogsTopic.main(args);
    }
}

package tk.hongkailiu.test.app.rabbitmq.t2;

import org.junit.Test;

/**
 * Created by ehongka on 7/2/15.
 */
public class NewTaskIT {

    @Test public void testMain() throws Exception {
        NewTask.main(new String[] {"1", "2", "3"});
    }
}

package tk.hongkailiu.test.app.rabbitmq.manymesssages;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

/**
 * Created by hongkailiu on 2015-06-30.
 */
public class Sender {
    private final static String QUEUE_NAME = "hello-many";

    private long c = 0;

    public void start() throws IOException, InterruptedException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        try {
            while (true) {
                Thread.sleep(100);
                String message = "Hello World!" + c;
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
                System.out.println(" [x] Sent '" + message + "'");
                c++;
            }
        } finally {
            channel.close();
            connection.close();
        }


    }
}

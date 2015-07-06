package tk.hongkailiu.test.app.rabbitmq.manymesssages;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by hongkailiu on 2015-06-30.
 */
public class Receiver {

    private final static String QUEUE_NAME = "hello-many";

    private BlockingQueue<String> messages = new LinkedBlockingQueue<String>(10000);

    private QueueingConsumer consumer;
    private ExecutorService threadPool;

    public Receiver() {
        init();
    }

    private void init() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

            consumer = new QueueingConsumer(channel);
            channel.basicConsume(QUEUE_NAME, true, consumer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        threadPool = Executors.newFixedThreadPool(1);
        threadPool.execute(new MessageRunner(consumer));
        read();
    }

    private void read() {
        while (true) {
            String message = messages.poll();
            if(message != null){
                System.out.println("poll message=" + message);
            }
        }
    }


    class MessageRunner implements Runnable {
        private QueueingConsumer consumer;

        MessageRunner(QueueingConsumer consumer) {
            this.consumer = consumer;
        }

        @Override public void run() {
            try {
                if (consumer != null) {
                    while (true) {
                        QueueingConsumer.Delivery delivery = consumer.nextDelivery();
                        String message = new String(delivery.getBody(), "UTF-8");
                        System.out.println(" [x] Received '" + message + "'");
                        messages.put(message);
                    }
                } else {
                    System.out.println("consumer is null");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        }
    }
}

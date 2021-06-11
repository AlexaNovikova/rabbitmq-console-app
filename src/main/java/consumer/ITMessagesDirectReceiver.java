package consumer;

import com.rabbitmq.client.*;

import java.util.Scanner;

public class ITMessagesDirectReceiver {
//    private static final String EXCHANGE_NAME = "ITArticles";
//
//    public static void main(String[] argv) throws Exception {
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setHost("localhost");
//        Connection connection = factory.newConnection();
//        Channel channel = connection.createChannel();
//
//        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
//
//        String queueName = channel.queueDeclare().getQueue();
//        System.out.println("My queue name: " + queueName);
//
//
//        System.out.println("Please enter theme in format : set_topic (php/java/c++)");
//        Scanner scanner = new Scanner(System.in);
//        String theme = scanner.nextLine().split(" ",2)[1];
//
//
//        channel.queueBind(queueName, EXCHANGE_NAME, theme);
//
//        System.out.println(" [*] Waiting for messages with theme " + theme);
//
//        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
//            String message = new String(delivery.getBody(), "UTF-8");
//            System.out.println(" [x] Received '" + message + "'");
//            System.out.println(Thread.currentThread().getName());
//        };
//
//        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> { });
//    }
}

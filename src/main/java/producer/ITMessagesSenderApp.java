package producer;

import com.rabbitmq.client.*;

import java.util.Scanner;


public class ITMessagesSenderApp {
//
//    private static final String EXCHANGE_NAME = "ITArticles";
//
//    public static void main(String[] argv) throws Exception {
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setHost("localhost");
//        try (Connection connection = factory.newConnection();
//             Channel channel = connection.createChannel()) {
//            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter article in format: topic(java/php/c++) text");
//            System.out.println("For example: java some message");
//            System.out.println("Enter 0 to quit");
//            while (true) {
//                String message = scanner.nextLine();
//                if (message.equals("0")){
//                    return;
//                }
//                String topic = message.split(" ", 2)[0];
//                message = message.split(" ", 2)[1];
//                channel.basicPublish(EXCHANGE_NAME, topic, null, message.getBytes("UTF-8"));
//                System.out.println("OK");
//                System.out.println("Enter new message or 0 - to quit");
//            }
//        }
//    }
}
package com.test.apollo.client;

import org.fusesource.hawtbuf.Buffer;
import org.fusesource.mqtt.client.*;
import org.junit.Test;

import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.fusesource.hawtbuf.Buffer.utf8;

/**
 * @Auther: SunBC
 * @Date: 2019/3/28 15:26
 * @Description:
 */
public class apolloClient {

    @Test
    public void simpleClientTest_producer(){
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        try {
            MQTT mqtt = new MQTT();
            mqtt.setHost("localhost", 61613);
            mqtt.setUserName("admin");
            mqtt.setPassword("password");

            FutureConnection connection = mqtt.futureConnection();
            Future<Void> f1 = connection.connect();
            f1.await();

            Future<byte[]> f2 = connection.subscribe(new Topic[]{new Topic(utf8("foo"), QoS.AT_LEAST_ONCE)});
            byte[] qoses = f2.await();
            CountDownLatch countDownLatch = new CountDownLatch(100);

            java.util.concurrent.Future<?> future = executorService.submit(() -> {
                countDownLatch.countDown();
                // send the message..
                connection.publish("foo", "Hello1".getBytes(), QoS.AT_LEAST_ONCE, false);

            });
            Object o = future.get();

            connection.disconnect().await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    @Test
    public void simpleClientTest_customer(){
        try {
            ////        final Broker broker = super.createBroker();
//        super.setUp();
            final Promise<Buffer> result = new Promise<Buffer>();

            MQTT mqtt = new MQTT();
            mqtt.setHost("localhost", 61613);
            mqtt.setUserName("admin");
            mqtt.setPassword("password");

            FutureConnection connection = mqtt.futureConnection();
            Future<Void> f1 = connection.connect();
            f1.await();

            Future<byte[]> f2 = connection.subscribe(new Topic[]{new Topic(utf8("foo"), QoS.AT_LEAST_ONCE)});
            byte[] qoses = f2.await();

            // We can start future receive..
            Future<Message> receive = connection.receive();
            // Then the receive will get the message.
            Message message = receive.await();
            System.out.println( new String(message.getPayload()));
//            assertEquals("Hello", new String(message.getPayload()));

            // To let the server know that it has been processed.
            message.ack();

            connection.disconnect().await();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

}

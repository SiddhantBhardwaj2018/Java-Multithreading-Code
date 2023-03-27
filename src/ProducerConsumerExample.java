import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

    public static void main(String[] args){

        BlockingQueue<String> blockingQueue =
                new ArrayBlockingQueue<>(3);

        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        Consumer consumer1 = new Consumer(blockingQueue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        Thread consumer1Thread = new Thread(consumer1);
        producerThread.start();
        consumerThread.start();
        consumer1Thread.start();
    }

}

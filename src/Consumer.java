import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<String> blockingQueue = null;

    public Consumer(BlockingQueue<String> queue){
        this.blockingQueue = queue;
    }

    @Override
    public void run() {
        while (true){
            try{
                String element = this.blockingQueue.take();
                System.out.println("consumed: " + element);
            }catch (InterruptedException e){
                System.out.println("Consumer was interrupted");
            }
            sleep(1000);
        }
    }

    private void sleep(long timeMilis){
        try {
            Thread.sleep(timeMilis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

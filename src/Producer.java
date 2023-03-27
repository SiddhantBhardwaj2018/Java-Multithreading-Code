import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private BlockingQueue<String> blockingQueue = null;

    public Producer(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while(true){
            long timeMilis = System.currentTimeMillis();
            try{
                this.blockingQueue.put("" + timeMilis);
                System.out.println("produced: " + timeMilis);
            }catch (InterruptedException e){
                System.out.println("Producer was interrupted");
            }
            sleep(1000);
        }
    }

    private void sleep(long timeMilis) {
        try{
            Thread.sleep(timeMilis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

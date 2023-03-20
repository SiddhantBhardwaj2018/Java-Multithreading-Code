import static java.lang.Thread.sleep;

public class ThreadExample9 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            while(true){
                sleep(1000);
                System.out.println("Running");
            }
        };

        Thread thread = new Thread( runnable );
        thread.setDaemon(true);
        thread.start();
        sleep(3100);
    }

    public static void sleep(long milis){
        try {
            Thread.sleep(milis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}

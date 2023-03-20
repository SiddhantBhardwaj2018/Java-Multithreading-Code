public class ThreadExample6 {

    public static void main(String[] args){
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Lambda with name " + threadName);
        };

        Thread thread = new Thread( runnable, "Siddhant thread" );
        thread.start();
        Thread thread2 = new Thread( runnable, "Siddhant thread2" );
        thread2.start();
        Thread thread3 = new Thread( runnable, "Siddhant thread3" );
        thread3.start();
    }

}

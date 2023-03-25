public class RaceConditionsExample3 {

    public static void main(String[] args){

        Counter counter = new Counter();

        Thread thread1 = new Thread(getIncrementingCounter(counter));
        Thread thread2 = new Thread(getReadingRunnable(counter));

        thread1.start();
        thread2.start();
    }

    private static Runnable getIncrementingCounter(Counter counter){
        return () -> {
            for(int i = 0;i < 1_000_000;i++){
                counter.incAndGet();
            }
            System.out.println("Thread1 final count: " + counter.get());
        };
    }

    private static Runnable getReadingRunnable(Counter counter){
        return () -> {
            for(int i = 0;i < 2;i++){
                try {
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread2 count: " + counter.get());
            }
        };
    }

}

public class RaceConditionsExample2 {

    public static void main(String[] args){
        CounterSynchronized counterSynchronized = new CounterSynchronized();

        Thread thread1 = new Thread( getRunnable(counterSynchronized, "Thread1 final count: "));
        Thread thread2 = new Thread(getRunnable(counterSynchronized, "Thread2 final count: "));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(CounterSynchronized counterSynchronized, String message){
        return () -> {
            for(int i = 0; i < 1_000_000;i++){
                counterSynchronized.incAndGet();
            }
            System.out.println(message + counterSynchronized.get());
        };
    }

}

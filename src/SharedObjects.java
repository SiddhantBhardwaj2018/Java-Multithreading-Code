public class SharedObjects {

    public static void main(String[] args){

        int myLocalVar = 5;
        String myLocalString = "Shreyash";

        Runnable runnable = new MyRunnable(new MyObject());

        Thread thread1 = new Thread( runnable , "Thread 1" );
        Thread thread2 = new Thread( runnable , "Thread 2");

        thread1.start();
        thread2.start();
    }

}

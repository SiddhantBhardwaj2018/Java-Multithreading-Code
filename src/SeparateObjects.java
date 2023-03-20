

public class SeparateObjects {

    public static void main(String[] args){

        int myLocalVar = 5;
        String myLocalString = "Siddhant";
/*
        Runnable runnable = new MyRunnable(new MyObject()); using different myObjects as
                                                              parameters creating diff objects in heap memory
        Runnable runnable2 = new MyRunnable(new MyObject());
*/

        MyObject myObject = new MyObject();

        Runnable runnable = new MyRunnable(myObject);
        Runnable runnable2 = new MyRunnable(myObject);
        Thread thread1 = new Thread( runnable , "Thread 1" );
        Thread thread2 = new Thread( runnable2 , "Thread 2" );

        thread1.start();
        thread2.start();
    }

}

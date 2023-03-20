public class ThreadExample2 {

    public static class MyThread extends Thread{
        public void run(){
            System.out.println("Thread is running");
            System.out.println("Thread is finished");
        }
    }

    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }

}

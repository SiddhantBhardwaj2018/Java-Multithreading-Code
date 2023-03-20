public class VirtualThreadExample {

    public static void main(String[] args){

        Runnable runnable = () -> {
            for(int i = 0;i < 10;i++){
                System.out.println("Index: " + i);
            }
        };

        Thread vThread1 = Thread.ofVirtual().start(runnable);

        // Example 2 :  Create but do not start a virtual thread
        Thread vThreadUnStarted = Thread.ofVirtual().unstarted(runnable);

        vThreadUnStarted.start();

        try{
            vThreadUnStarted.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

}

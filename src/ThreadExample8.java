public class ThreadExample8 {

    public static class StoppableRunnable implements Runnable{

        private Boolean stopRequested = false;

        public synchronized void requestStop(){
            this.stopRequested = true;
        }

        public synchronized Boolean isStopRequested(){
            return this.stopRequested;
        }

        private void sleep(long milis){
            try{
                Thread.sleep(milis);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        @Override
        public void run(){
            System.out.println("StoppableRunnable running");
            while( !isStopRequested() ){
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("StoppableRunnable stopped");
        }
    }

    public static void main(String[] args){
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread( stoppableRunnable );
        thread.start();
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("requesting stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");
    }

}

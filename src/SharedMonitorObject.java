public class SharedMonitorObject {
    private Object monitor = null;

    private int counter = 0;

    public SharedMonitorObject(Object object){
        if(monitor == null){
            throw new IllegalArgumentException("Monitor object cannot be null");
        }
        this.monitor = object;
    }

    public void inCounter(){
        synchronized (this.monitor){
            this.counter++;
        }
    }

}

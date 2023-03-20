public class MixedSynchronization {

    public static Object myObj = null;

    public static synchronized void setStaticObj(Object obj){
        myObj = obj;
    }

    public Object obj = null;

    public synchronized void setObject(Object obj){
        this.obj = obj;
    }

}

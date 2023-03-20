public class StaticSynchronizedExchanger {

    private static Object object = null;

    public static synchronized void setObject(Object object){
        object = object;
    }

    public static synchronized Object getObject(){
        return object;
    }

    public static Object getObj(){
        synchronized (StaticSynchronizedExchanger.class){
            return object;
        }
    }

    public static void setObj(Object object){
        synchronized (StaticSynchronizedExchanger.class){
            object = object;
        }
    }

}

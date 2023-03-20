public class Exchanger {

    private Object object = null;
    private volatile Boolean hasNewObject = false;

    public void setHasNewObject(Object obj){
        this.object = obj;
        this.hasNewObject=true;
    }
    public Object getObject(){
        while(!hasNewObject){
            //busy wait
        }

        Object returnValue = this.object;
        this.hasNewObject = false;
        return returnValue;
    }

}

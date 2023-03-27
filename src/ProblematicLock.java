public class ProblematicLock implements MyLock{

    private volatile boolean locked = true;

    public void unlock(){
        this.locked = false;
    }

    public void lock(){
        while(this.locked){
            //busy-wait - until this.locked is false
        }

        this.locked = true;
    }

}

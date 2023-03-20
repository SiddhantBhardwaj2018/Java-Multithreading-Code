public class Counter {

    protected long count = 0;

    public long get(){
        return this.count;
    }

    public long incAndGet(){
        synchronized (this){
            this.count++;
            return this.get();
        }
    }

}

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

    private long count = 0;
    private Lock lock = new ReentrantLock(true); //true means lock guarantee fairness guaranteed, prevents deadlock

    public void inc(){
        try {
            lock.lock();
            this.count++;
        }finally {
            lock.unlock();
        }
    }

    public long getCount(){
        try {
            lock.lock();
            return this.count;
        }finally {
            lock.unlock();
        }
    }
}

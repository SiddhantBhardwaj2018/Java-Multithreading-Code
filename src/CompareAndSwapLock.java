import java.util.concurrent.atomic.AtomicBoolean;

public class CompareAndSwapLock implements MyLock{

    private AtomicBoolean atomicLocked = new AtomicBoolean(false);

    @Override
    public void lock() {
        while (!this.atomicLocked.compareAndSet(false,true)){
            // busy wait - until compareAndSet succeeds
        }
    }

    @Override
    public void unlock() {
        this.atomicLocked.set(false);
    }
}

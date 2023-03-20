public class MyRunnable implements  Runnable{

    private int count = 0;

    private MyObject myObject;
    //by placing myObject in the attribute, just one myObject will exist in Heap Memory
    // as an attribute of MyRunnable hence, it will be shared beween multiple threads,
    // if the same runnable is passed to multple threads as parameter.

    public MyRunnable(MyObject myObject){
        this.myObject = myObject;
    }

    @Override
    public void run() {

        //MyObject myObject = new MyObject(); //By instantiating here in the run method, we will be creating a new object, everytime run method is executed.
        System.out.println(myObject);

        for(int i = 0;i < 1_000_000;i++){
            synchronized (this){
                this.count++;
            };
        }
        System.out.println(
                Thread.currentThread().getName() + " : "  + this.count
        );
    }
}

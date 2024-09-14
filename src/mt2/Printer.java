package mt2;

public class Printer implements Runnable{
    int val;
    public Printer(int val){
        this.val=val;
    }
    @Override
    public void run() {
        System.out.println(val + " from thread: " + Thread.currentThread().getName());
    }
}

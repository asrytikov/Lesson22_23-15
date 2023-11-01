package p3;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Start: " + Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }catch (InterruptedException exception){
            System.out.println("Err: interrupted");
        }
        System.out.println("End: " + Thread.currentThread().getName());
    }
}

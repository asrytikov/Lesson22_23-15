package p2;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

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


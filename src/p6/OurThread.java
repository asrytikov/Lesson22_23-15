package p6;

public class OurThread extends Thread{

    public OurThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Start: " + Thread.currentThread().getName());
        int count = 1;
        while (!isInterrupted()) {
            System.out.println("Count = " + count++);
        try {
            Thread.sleep(500);
        } catch (InterruptedException exception) {
            System.out.println("Err: interrupted");
            //interrupt();
            break;
        }}
        System.out.println("End: " + Thread.currentThread().getName());
    }
}

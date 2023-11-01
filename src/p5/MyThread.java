package p5;

public class MyThread implements Runnable{

    private boolean activeStatus;

    public MyThread() {
        this.activeStatus = true;
    }

    public void disThread(){
        activeStatus = false;
    }

    @Override
    public void run() {
        System.out.println("Start: " + Thread.currentThread().getName());
        int count = 1;
        while (activeStatus) {
            System.out.println("Count = " + count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                System.out.println("Err: interrupted");
            }
        }
        System.out.println("End: " + Thread.currentThread().getName());
    }
}

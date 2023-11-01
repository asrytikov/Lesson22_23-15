package p5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread start");
        MyThread myThread = new MyThread();
        new Thread(myThread, "MyThread").start();
        try {
            Thread.sleep(1200);
            myThread.disThread();
            Thread.sleep(1000);
        }catch (InterruptedException exception){
            System.out.println("Err");
        }
        System.out.println("Main is finish");
    }
}

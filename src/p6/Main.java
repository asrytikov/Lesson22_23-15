package p6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread start");
        OurThread ourThread = new OurThread("MyThread");
        ourThread.start();
        try {
            Thread.sleep(100);
            ourThread.interrupt();
            Thread.sleep(100);
        }catch(
            InterruptedException exception) {
                System.out.println("Err");
        }
        System.out.println("Main is finish");
    }
}

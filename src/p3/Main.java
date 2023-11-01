package p3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread start");
        for (int i = 0; i < 5; i++) {
            Thread myThread = new Thread(new MyThread(), "MyThread" + i);
            myThread.start();
            try {
                myThread.join();
            }catch (InterruptedException exception){
                System.out.println("Err: interrupted " + myThread.getName());
            }
        }
        System.out.println("End finish main thread");
    }
}

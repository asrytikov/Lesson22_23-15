package p2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread start");
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread("MyThread" + i);
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

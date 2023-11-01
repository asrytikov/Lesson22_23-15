package p4;

import p3.MyThread;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main thread");

        Runnable runnable = () -> {
            System.out.println("Start: " + Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }catch (InterruptedException exception){
                System.out.println("Err: interrupted");
            }
            System.out.println("End: " + Thread.currentThread().getName());
        };
        System.out.println("Main thread start");
        for (int i = 0; i < 5; i++) {
            Thread myThread = new Thread(runnable, "MyThread" + i);
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

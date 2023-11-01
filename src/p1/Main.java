package p1;

public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getThreadGroup().getName());
    }
}
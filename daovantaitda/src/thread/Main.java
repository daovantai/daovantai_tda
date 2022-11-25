package thread;

public class Main {
    public static void main(String[] args) {
        Thread1 mythread1= new Thread1();
        Thread t1 = new Thread(mythread1);
        Thread2 mytThread2= new Thread2();
        t1.start();

        mytThread2.start();

    }
}

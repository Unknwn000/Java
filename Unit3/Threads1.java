class MainThread extends Thread {
    @Override
    public void run() {
        for (int i = 501; i <= 700; i++) {
            System.out.println("Greeting from Thread " + Thread.currentThread().getName() + ": " + i);
        }
    }
}

class ChildThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 250; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class ChildThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 251; i <= 500; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class Threads1 {
    public static void main(String[] args) {
        MainThread mainThread = new MainThread();
        mainThread.start();

        ChildThread1 childThread1 = new ChildThread1();
        childThread1.start();

        ChildThread2 childThread2 = new ChildThread2();
        Thread thread2 = new Thread(childThread2);
        thread2.start();
    }
}

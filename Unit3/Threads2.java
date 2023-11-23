class MultiplicationTableThread extends Thread {
    private int number;

    public MultiplicationTableThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads2 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        int n3 = 4;

        MultiplicationTableThread childThread1 = new MultiplicationTableThread(n1);
        MultiplicationTableThread childThread2 = new MultiplicationTableThread(n2);

        childThread1.start();
        try {
            childThread1.join(); // Wait for childThread1 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        childThread2.start();
        try {
            childThread2.join(); // Wait for childThread2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread continues after childThread1 and childThread2 have completed
        MultiplicationTableThread mainThread = new MultiplicationTableThread(n3);
        mainThread.start();
    }
}

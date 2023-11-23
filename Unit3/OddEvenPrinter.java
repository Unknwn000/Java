class NumberPrinter {
    private int n;
    private boolean isOdd = true;

    public NumberPrinter(int n) {
        this.n = n;
    }

    public synchronized void printOdd(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd " + number);
        isOdd = false;
        notify();
    }

    public synchronized void printEven(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even " + number);
        isOdd = true;
        notify();
    }
}

public class OddEvenPrinter {
    public static void main(String[] args) {
        int n = 20;
        NumberPrinter printer = new NumberPrinter(n);

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= n; i += 2) {
                printer.printOdd(i);
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= n; i += 2) {
                printer.printEven(i);
            }
        });

        oddThread.start();
        evenThread.start();
    }
}


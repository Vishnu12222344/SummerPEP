package summerpep2.Threads;

public class EvenOddThreads {
    public static void main(String[] args) {

        Thread evenThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("EvenThread: " + i);
                }
            }
        }, "EvenThread");

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("OddThread: " + i);
                }
            }
        }, "OddThread");

        evenThread.start();
        oddThread.start();

        System.out.println("Both threads finished.");
    }
}


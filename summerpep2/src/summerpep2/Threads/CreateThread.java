package summerpep2.Threads;

public class CreateThread {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                String threadname = Thread.currentThread().getName();
                for (int i = 0; i < 10; i++) {
                    System.out.println(threadname + " " + i);
                }
            }
        };

        t1.start();

        String threadname = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(threadname + " " + i);
        }
    }
}

package ExecutorServices;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class EvenorOddExecutor {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable evenTask = () -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " - Even: " + i);
                }
            }
        };
        Runnable oddTask = () -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " - Odd: " + i);
                }
            }
        };
        executor.submit(evenTask);
        executor.submit(oddTask);
        executor.shutdown();
    }
}

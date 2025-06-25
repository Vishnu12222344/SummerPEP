package ExecutorServices;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeNumbersExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable primeTask1 = () -> {
            for (int i = 1; i <= 25; i++) {
                if (isPrime(i)) {
                    System.out.println("Task1 - Prime: " + i);
                }
            }
        };
        Runnable primeTask2 = () -> {
            for (int i = 26; i <= 50; i++) {
                if (isPrime(i)) {
                    System.out.println("Task2 - Prime: " + i);
                }
            }
        };
        executor.submit(primeTask1);
        executor.submit(primeTask2);

        executor.shutdown();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

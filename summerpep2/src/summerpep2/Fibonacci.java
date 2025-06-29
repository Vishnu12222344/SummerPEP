package summerpep2;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the position (n): ");
        int n = s.nextInt();

        int a = 0, b = 1, fib = 0;

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            for (int i = 3; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.println("The " + n + "th Fibonacci number is: " + fib);
        }
    }
}

//// Iterative approach
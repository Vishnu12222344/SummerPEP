package summerpep2.Interfaces.PaymentMethods;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentMethod payment = null;

        System.out.println("Choose a payment method: CreditCard / Paypal / UPI");
        String choice = scanner.nextLine();

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        switch (choice.toLowerCase()) {
            case "creditcard":
                payment = new CreditCard();
                break;
            case "paypal":
                payment = new Paypal();
                break;
            case "upi":
                payment = new UPI();
                break;
            default:
                System.out.println("Invalid payment method selected.");
                System.exit(0);
        }

        PaymentMethod.printWelcomeMessage();
        payment.processPayment(amount);
        payment.transactionSummary();
    }
}

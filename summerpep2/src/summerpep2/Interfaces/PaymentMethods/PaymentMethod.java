package summerpep2.Interfaces.PaymentMethods;

public interface PaymentMethod {
    void processPayment(double amount);
    void transactionSummary();

    static void printWelcomeMessage() {
        System.out.println("Welcome to the Payment Portal");
    }
}

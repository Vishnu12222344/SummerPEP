package summerpep2.Interfaces.PaymentMethods;

public class UPI implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("UPI payment of ₹" + amount + " processed successfully.");
    }

    @Override
    public void transactionSummary() {
        System.out.println("UPI transaction complete.");
    }
}

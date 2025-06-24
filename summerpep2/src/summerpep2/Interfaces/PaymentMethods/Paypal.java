package summerpep2.Interfaces.PaymentMethods;

public class Paypal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment of ₹" + amount + " processed successfully.");
    }

    @Override
    public void transactionSummary() {
        System.out.println("PayPal transaction complete.");
    }
}

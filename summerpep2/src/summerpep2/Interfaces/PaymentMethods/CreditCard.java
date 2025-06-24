package summerpep2.Interfaces.PaymentMethods;

public class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        if (amount >= 500) {
            System.out.println("Credit Card payment of ₹" + amount + " processed successfully.");
        } else {
            System.out.println("Minimum ₹500 required for Credit Card payment.");
        }
    }

    @Override
    public void transactionSummary() {
        System.out.println("Credit Card transaction complete.");
    }
}

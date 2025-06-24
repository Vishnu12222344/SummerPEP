package summerpep2.OOPS;

abstract class PaymentMethod {
    protected String methodName;

    public PaymentMethod(String methodName) {
        this.methodName = methodName;
    }
    public abstract void processPayment(double amount);
    public static void printWelcomeMessage() {
        System.out.println("Welcome\n");
    }
    public void transactionSummary(double amount) {
        System.out.println("Payment method: " + methodName);
        System.out.println("Amount Paid: ₹" + amount);
    }
}
class CreditCard extends PaymentMethod {
    public CreditCard() {
        super("Credit Card");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount + "...");
        // Custom logic
        System.out.println("Credit card payment successful.");
    }
}
class UPIPayment extends PaymentMethod {

    public UPIPayment() {
        super("UPI");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount + "...");
        System.out.println("UPI payment successful.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        PaymentMethod.printWelcomeMessage();

        PaymentMethod payment;

        payment = new CreditCard();
        payment.processPayment(1500.00);
        payment.transactionSummary(1500.00);

        System.out.println();

        payment = new UPIPayment();
        payment.processPayment(750.50);
        payment.transactionSummary(750.50);
    }
}


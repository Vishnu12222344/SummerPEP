package summerpep2.OOPS;

//Encapsulation

public class Encapsulation {
    private double balance;
    public Encapsulation(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
    	Encapsulation bank = new Encapsulation(1000);
        System.out.println("Initial Balance: " + bank.getBalance());
        bank.deposit(500);
        System.out.println("After Deposit: " + bank.getBalance());
    }
}

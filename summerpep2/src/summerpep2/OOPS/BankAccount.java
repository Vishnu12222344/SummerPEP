package summerpep2.OOPS;
public class BankAccount {
    private String accountNumber;
    private String name;
    private double balance;
    private static String bankName = "Default Bank";
    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("insufficient Balance.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void updateBankName(String newBankName) {
        bankName = newBankName;
        System.out.println("Bank name updated to: " + bankName);
    }
    public static String getBankName() {
        return bankName;
    }
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank: " + bankName);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount.updateBankName("Canara Bank");
        BankAccount acc1 = new BankAccount("123456", "Vishnu", 1000.0);
        acc1.displayAccountInfo();
        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.updateBankName("State Bank of India");
        System.out.println("Final Balance: " + acc1.getBalance());
        System.out.println("Bank Name: " + BankAccount.getBankName());
    }
}


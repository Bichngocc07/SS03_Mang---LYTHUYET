public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double money) {
        if (money <= 0) {
            System.err.println("Số tiền nạp không hợp lệ!");
        } else {
            balance += money;
        }
    }


    public void withdraw(double money) {
        if (money > 0 && balance - money >= 0) {
            balance -= money;
        } else {
            System.err.println("Số dư không đủ hoặc số tiền không hợp lệ!");
        }
    }


    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}

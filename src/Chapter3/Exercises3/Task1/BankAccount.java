package Chapter3.Exercises3.Task1;

public class BankAccount {
    private static int totalAccounts = 0;
    private final int accountNumber;
    private double balance;
    BankAccount(double balance){
        this.accountNumber = ++totalAccounts;
        this.balance = balance;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Depositing: "+amount+" balance: "+this.balance);
    }
    public void withdraw(double amount){
        this.balance -= amount;
        System.out.println("Withdrawn: "+amount+" balance: "+this.balance);
    }

    public double getBalance() {
        return balance;
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}

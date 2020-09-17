public class Account { 
    private long accountNumber;
    private double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        //System.out.println("Account(long, double) initialized");
    }
    public Account() {
        balance = 0.0;
        System.out.println("Account() intialized");
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() { 
        return balance; 
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void withdraw(double amount) {
	balance-= amount;
	System.out.println("Money debited from  account No"+getAccountNumber());
    }

    /* deposit must return the balance
    */
    public void deposit(double amount) {
	balance+= amount;
	System.out.println("Money deposited in account "+getAccountNumber());
    }
    public void accountInformation() {
        System.out.println( "account information are : ");
        System.out.println("Account Number= "+accountNumber);
        System.out.println("Balance = "+balance);
    }
}

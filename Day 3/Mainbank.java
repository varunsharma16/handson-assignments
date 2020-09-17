public class MainBank {
    public static void main(String[] args) {
       /*
        //pass the accountNo and amount to deposit from CLA
        //get the Account using the accountNo by calling getAccount(...)
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        
        // show the account information before deposit
        //deposit the amount to that particular Account
        //show the account information after deposit
	//ASSIGNMENT P1 DAY3
	long accountNo = Long.parseLong(args[0]);
	double amount = Double.parseDouble(args[1]);
	Account acco= MainBank.getAccount(accountNo);
	if(acco != null) {
		acco.accountInformation();
		acco.deposit(amount);
		acco.accountInformation();
	}
	else
		System.out.println("Account not found");
     */
	//Assignment-2 part2 Day3

	long accountNo1 = Long.parseLong(args[0]);
	long accountNo2 = Long.parseLong(args[1]);
	double amount = Double.parseDouble(args[2]);
	Account ac1 = MainBank.getAccount(accountNo1);
	Account ac2 = MainBank.getAccount(accountNo2);
	if(ac1 != null && ac2 != null) {
		if(ac1.getBalance() >= amount) {
			ac1.withdraw(amount);
			ac2.deposit(amount);
			System.out.println("Transfer successful");
		}
		else
			System.out.println("Insufficient balance ");
	}
	else
		System.out.println(" Invaild Account Number");
	
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account account =null;
	Account[] accounts = AccountsDB.getAccounts();
	for(Account a: accounts){
		if(a.getAccountNumber() == accountNo)
			   account=a;
	
    }
    return account;
  }

}

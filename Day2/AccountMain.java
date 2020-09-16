
public class AccountMain {

	public static void main(String[] args) {
        Account user1=new Account("2345678880","raj","Rajasthan","jaipur","399019");
        user1.deposit(50000);
        user1.display();
        user1.withdraw(20000);
        user1.display();
        
        Account user2=new Account("2369559599","varun","Gujrat");
        user2.deposit(500);
        user2.withdraw(700);
        user2.display();

        Account user3=new Account("8384384380","rohit");
        user3.deposit(900);
        user3.withdraw(200);
        user3.display();
 
	}

}

public class Account {
    private String accountno;
    private String name;
    private String state;
    private String city;
    private String ifsc="HSBC001";
    private String pin;
    private double balance;
   public Account(String accountno, String name, String state, String city, String pin) {
       
       this.accountno = accountno;
       this.name = name;
       this.state = state;
       this.city = city;
       this.pin = pin;
       
   }
   public Account(String accountno, String name, String state) {
       
       this.accountno = accountno;
       this.name = name;
       this.state = state;
       
   }
   public Account(String accountno, String name) {
       super();
       this.accountno = accountno;
       this.name = name;
   }
   public void withdraw(int amount)
   {
       if (amount<balance)
       {
           
           balance=balance-amount;
           System.out.println("your withdraw was succesful");
       }
       else
           System.out.println("Not enough balance ");
   }
   public void deposit(int amount)
   {
       balance =balance+amount;
       System.out.println(" your money is deposited");
   }
   
   public void display()
   {
       System.out.println("yours details are  " + "  account no = " + accountno + "  ifsc = " + ifsc + " name = " + name + " City= " + city + " state= " + state + " pin = " + pin);
       System.out.println("Your balance is "+balance);
   }
   
   
    
    
    
    
    

}

public class EmployeeQ2main {

	public static void main(String[] args) {
        EmployeeQ2[] emp=new EmployeeQ2[5];
        Address t1=new Address("RAJ","JAI ","203040");
        Address t2=new Address("MH","MUM ","203040");
        Address t3=new Address("AP","HYD","203040");
        Address t4=new Address("MP","GWALIOR ","203040");
        
		
		emp[0]=new EmployeeQ2(10,"Raman",30000.00,t1);
		emp[1]=new EmployeeQ2(20,"Raj",40000.00,t2);
		emp[2]=new EmployeeQ2(30,"Rohit",60000.00,t3);
		emp[3]=new EmployeeQ2(20,"harsh",70000.00,t4);
		emp[4]=new EmployeeQ2(20,"Rahil",80000.00,t4);
		
		for(EmployeeQ2 s1:emp)
		{
			s1.caller();
		}
	}

}

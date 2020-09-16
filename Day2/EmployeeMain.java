public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] emp=new Employee[5];
		
		emp[0]=new Employee(10,"Raman",30000.00);
		emp[1]=new Employee(20,"Raj",40000.00);
		emp[2]=new Employee(30,"Rohit",60000.00);
		emp[3]=new Employee(20,"harsh",70000.00);
		emp[4]=new Employee(20,"Raina",80000.00);
		
		for(Employee s:emp)
		{
			s.caller();
		  
		}
		

}
}


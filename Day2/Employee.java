public class Employee {
	private int id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void caller()
	{
		if(salary>50000)
		{
			display();
		}
		else
		{
			System.out.println("salary below 50000");
		}
	}
	public void  display()
	{
		
		
			System.out.println("ID = "  +  id   +    "Name  ="  +  name );
		
		
	}
	
	
	

}

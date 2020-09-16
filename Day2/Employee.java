
public class Employee {
	private int id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void  display()
	{
		if(salary >50000)
		{
			System.out.println("ID = "  +  id   +    "Name  ="  +  name );
		}
		else
		{
			System.out.println(" salary below 50000.00");
		}
	}
	
	
	

}

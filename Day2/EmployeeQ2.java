
public class EmployeeQ2 {
	private  int id;
	private  String name;
	private  Double salary;
	public Address addr;
	public EmployeeQ2(int id, String name, Double salary, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr = addr;
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

		
		
	public void display()
	{
	
		
			System.out.println("Name =" +name + "id =" + id + "state =" + addr.state  + "city =" +addr.city + "pin ="  + addr.pin);
		
	}
}

	
	 
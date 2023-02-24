package Assignment8;


public class Employee { 
	
	private String name, hireDay;
	private double salary;
	
	public Employee(String name, double salary, String hireDay)
	{
		
		this.name=name;
		this.salary=salary;
		this.hireDay=hireDay;
		
	}
	

	public void raiseSalary()
	{
		
		salary=salary+salary*5/100;		
		
	}
	
	public void EmployeeData()
	{
		System.out.println("name="+name+","+"salary="+salary+","+"hireDay="+hireDay);
	}
	

}



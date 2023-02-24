package Assignment8;

public class EmployeeMain { 

	
	public static void main(String[] args) 
	{
		
		Employee[] empData = new Employee[3];
		
		empData[0]= new Employee("Carl Cracker",78750.0,"1987-12-15");
		empData[1]= new Employee("Harry Hacker",52500.0,"1989-10-01");
		empData[2]= new Employee("Tony Tester",42000.0,"1990-03-15");
		
		for(Employee employeeDetails: empData)
		{
			employeeDetails.EmployeeData();
				
		}
		
		System.out.println();
		System.out.println("Salary after salary increment of 5%");
		
		
		for(Employee employeeDetails:empData)
		{
			employeeDetails.raiseSalary();
			
			employeeDetails.EmployeeData();	
		}
		
	}
	
	
}

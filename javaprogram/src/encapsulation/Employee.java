package encapsulation;

public class Employee {
	private int empId;//declaring
	//getter
	public int getEmpId()
	{
		return empId;
	}
	private String empName;//declaring
	//getter
	public String getEmpName()
	{
		return empName;
	}
	//setter(used for changing)
	public void setEmpName(String empName)//string is a local variable ,taken to store new value
	{
		this.empName=empName;//setting the data
	}
	private double salary;//declaration
	//getter
	public double getsal()
	{
		return salary;
	}
	//setter
	public void setSal(double salary)
	{					
		this.salary=salary;
	}
	
	//parameterised constructor
		public Employee(int empId,String empName,double salary)
		{				//
			this.empId=empId;
			this.empName=empName;
			this.salary=salary;
		}
	
	//constructor overloading
	public Employee(String empName)
		{
		this.empName=empName;
		System.out.println("Employee Name(using chaining)="+empName);
		}
	public Employee(int empId)
		{
			this.empId=empId;
			
		}	
	public Employee(double salary)
	{
		this.salary=salary;
	}
	public Employee(int empId,double salary)
	{
		this.empId=empId;
		this.salary=salary;
	}
	public Employee(double salary,int empId)
	{
		this.salary=salary;
		this.empId=empId;
	}
	public Employee(int empId,double salary,String empName)
	{		
		this("TINU");//chaining
	this.empId=empId;
	this.salary=salary;
	this.empName=empName;
	}
	public Employee(String empName,int empId,double salary)
	{		
	this.empName=empName;
	this.empId=empId;
	this.salary=salary;
	}

		//non static methods
		public void display()
		{
			System.out.println("Employee ID="+this.empId);
			System.out.println("Employee Name="+this.empName);
			System.out.println("Employee Salary="+this.salary);
		}
}

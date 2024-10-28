package arrayPrograms;

public class EmployeeDriver {
public static void main(String[] args) {
	//declare and initialise the object of employee type
	Employee[]emp=new Employee[4];
	//initialising
	emp[0]=new Employee(101,"Ajay");
	emp[1]=new Employee(102,"Rita");
	emp[2]=new Employee(190,"Swati");
	emp[3]=new Employee(110,"Sunita");
	//displaying array of object
	for(Employee ele:emp)
	{
		System.out.println(ele);
	}
	
	
}
}

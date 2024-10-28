package arrayPrograms;

public class Employee {
	//non static variables
	int empId;
	String EmpName;
	//constructor
	public Employee(int empId, String empName) {
		this.empId = empId;
		EmpName = empName;
	}
	@Override
	public String toString() {
		return "Employee empId="+ empId +"\n EmpName="+ EmpName;
		
	}
}

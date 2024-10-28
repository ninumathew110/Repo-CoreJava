package encapsulation;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1=new Employee(121458,200000.0,"ANOOP");
		Employee e2=new Employee(1214500,120000.0,"NITIN");
		//Employee e3=new Employee(1314021,31000.0);
		Employee e4=new Employee("Sinu",121458,140000.0);
		Employee e5=new Employee(80000.0,1354984);
		//Employee e6=new Employee(7000.0);
		Employee e7=new Employee(1215769);
		//Employee e8=new Employee("SUNNY");
		
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getsal());
		e1.setEmpName("NINU");
		e1.setSal(150000);
		e1.display();
		e2.display();
		//e3.display();
		e4.display();
		e5.display();
		//e6.display();
		e7.display();
		//e8.display();
		
	}


}

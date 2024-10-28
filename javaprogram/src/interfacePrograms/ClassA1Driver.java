package interfacePrograms;

public class ClassA1Driver {
	public static void main(String[] args) {
		I1 obj1=new ClassA1();//upcasting
		obj1.m1();
		//obj1.m2();//This static method of interface I1 can only be accessed as I1.m2
		I1.m2();
		System.out.println(obj1.code);//the static field I1.code should be accessed
		System.out.println(I1.code);	
		
		I3 obj2=new ClassA1();//upcasting
		obj2.m1();
		
		obj2=(I3)obj1;//downcasting(converting one parent into another parent type,if both parent has same child)
		
		I3 obj3=(I3)obj1;
		
		I1 obj4=(I1)obj3;
		obj4.m1();
		
	}

}

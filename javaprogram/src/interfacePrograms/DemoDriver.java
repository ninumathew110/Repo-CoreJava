package interfacePrograms;

public class DemoDriver {
public static void main(String[] args) {
	I2 obj=new Demo();//upCasting
	obj.a1();
	obj.m1();
	//obj.m2();//The method m2() is undefined for the type I2
	//obj.a2();//This static method of interface I2 can only be accessed as I2.a2
	I2.a2();
	System.out.println(obj.test);
	System.out.println(I2.test);
	
	Demo d1=(Demo)obj;//downCasting
	d1.demo1();
	d1.demo2();
	
	I1 obj1=new Demo();//upCasting
	//obj1.a1();//I2
	obj1.m1();
	I1.m2();

	System.out.println(obj1.code);
	System.out.println(I1.code);
	
	Demo d2=(Demo)obj;//downCasting
	d2.demo1();
	d2.demo2();
	
}
}
 

package Polymorphism;

public class ABCD_DRIVER {
	public static void main(String[] args) {
		B obj1=new D();//upcasting)-)instance of A B C D
		System.out.println(obj1.a);//317
		System.out.println(obj1.d);
		obj1.m1();
		
		C obj2=(C)obj1;//downcating
		System.out.println(obj2.a);
		System.out.println(obj2.d);
		obj2.m1();
		
		A obj3=new B();//upcasting->instance of only B,A.So next create object of B should be created,OTHERWISE exeception will come,so B obj4=(B)obj3,following 3 rules
		System.out.println(obj3.a);
		System.out.println(obj3.d);
		obj3.m1();
		
		D obj4=(D) obj1;//downcasting
		System.out.println(obj4.a);
		System.out.println(obj4.d);
		obj4.m1();
		
	}

}

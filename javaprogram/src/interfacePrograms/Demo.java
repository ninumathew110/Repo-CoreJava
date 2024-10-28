package interfacePrograms;

public class Demo implements I2{
	int i1=100;
	static double i2=200.0;
	Demo()
	{
		System.out.println("Demo class constructor");
	}
 public void m1()
{
	System.out.println("m1() implemented in Demo class");
}
 public void a1()
 {
  System.out.println("a1() implemented in Demo class");
 }
 public void demo1()
 {
	 System.out.println("demo1() from Demo class");
 }
 public static void demo2()
 {
	 System.out.println("demo2() from Demo class");
 }
}
 
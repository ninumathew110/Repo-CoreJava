package accessModifierPrograms;
//private class A1->//CANT DO,JVM cannot give execution control a private class
public class A1 {
	private int a;//
	//A1()
	private A1()//yes we can make constructor private,but cant access its objs outside the class
	{
		System.out.println("A1 constructor");
	}
private void hello()
{
	System.out.println("Hello");
	a=10;
	System.out.println(a);
}
void m1()
{
	hello();
}
public static void main(String[] args) {
	A1 obj1=new A1();
	
}
}

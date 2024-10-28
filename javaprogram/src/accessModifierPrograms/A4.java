package accessModifierPrograms;

public class A4 {
	//protected class A4{//we cannot make protected class,its illeligal
 protected int a=10;
 
 protected A4()
 {
	 System.out.println("A4()");
 }
 
 protected void m1()
 {
	 System.out.println(a);
 }
}

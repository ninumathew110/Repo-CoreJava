package exceptionHandlingPrograms;
//throw->checked exception
public class A7 {
public static void main(String[] args) throws InterruptedException//->given this msg to JVM,since it handles it internally
	{
	System.out.println("Go to sleep");
	Thread.sleep(2000);//sleep is staticmethod ,so called using classname(thread)
	System.out.println("Awake");


}
}

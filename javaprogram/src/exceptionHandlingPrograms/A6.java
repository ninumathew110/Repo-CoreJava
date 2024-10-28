package exceptionHandlingPrograms;
//throws-->unchecked exception
public class A6 {
public static void checkString()throws NullPointerException
{
	String name=null;
	if(name.equals("swati"))
		System.out.println(name);
	else
		System.out.println("swati");
}
public static void main(String[] args) {
	try
	{
	checkString();
	}
	catch(NullPointerException e)
	{
		System.out.println("NullPointerException handled");
	}
}
}

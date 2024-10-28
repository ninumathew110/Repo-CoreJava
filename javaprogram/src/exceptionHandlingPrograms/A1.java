package exceptionHandlingPrograms;

public class A1 {
	public static void div()
	{
		int a=10,b=0;
		try
		{
		int c=a/b;//risky statement
		//10/0->Exception in thread "main" java.lang.ArithmeticException:
		System.out.println("Quotient="+c);
	}
	catch(ArithmeticException a1)
	{
		System.out.println("ArithmeticException Handled");
	}
	}
public static void main(String[] args) {
	div();
}
}



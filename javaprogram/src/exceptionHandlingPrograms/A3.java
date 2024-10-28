package exceptionHandlingPrograms;

public class A3 {
	public static void main(String[] args) {
		int a=10,b=0,c;
		int []d=new int[3];
		try
		{
			c=a/b;//risky statement
			d[0]=90;
			d[1]=78;
			d[2]=62;
			d[3]=45;//risky statement
			c=a/b;//risky statement
			
	}
		catch(ArithmeticException  a1)//specific catch block
		{
			System.out.println("ArithmeticException "+" handled");
		}
		
		catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("ArrayIndexOutOfBoundsException"+" handled");
	}
	
}
}
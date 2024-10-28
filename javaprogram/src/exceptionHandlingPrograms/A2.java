package exceptionHandlingPrograms;

public class A2 {
public static void main(String[] args) {
	int n[]=new int[5];
	try {
	n[0]=56;
	n[1]=89;
	n[2]=10;
	n[3]=90;
	n[4]=44;
	n[5]=66;//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
}
	catch(ArithmeticException  a2)//specific catch block
	{
		System.out.println("ArithmeticException "+" handled");
	}
	
	catch(ArrayIndexOutOfBoundsException a1)
	{
		System.out.println("ArrayIndexOutOfBoundsException"+" handled");
	}
	catch(Exception a3)//most general catch block->it should be written only in end,bz children block need to read first and then parent
	{
		System.out.println("Exception  handled");
	}
}
}

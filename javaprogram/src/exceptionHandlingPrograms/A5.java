package exceptionHandlingPrograms;
import java.util.InputMismatchException;
import java.util.Scanner;
public class A5 {
public static void main(String[] args) {
	Scanner sc=null;
	try {
		sc=new Scanner(System.in);
		System.out.println("Enter an int value");
		int num=sc.nextInt();
		System.out.println("data enter="+num);
	}
	catch(InputMismatchException e)
	{
		System.out.println("Error: you must enter integer value");
	}
	finally
	{
		sc.close();//to close the scanner for releasing the resource
		System.out.println("closes the standard input stream");
	}
}
}

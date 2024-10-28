package exceptionHandlingPrograms;
import java.util.Scanner;
public class A8 {
public static void checkAge(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("You are not eligible to cast a vote");
	}
	else
	{
		System.out.println("You are eligible to cast a vote");
	}
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age");
	int age=sc.nextInt();
	checkAge(age);
	sc.close();	
						
}
}

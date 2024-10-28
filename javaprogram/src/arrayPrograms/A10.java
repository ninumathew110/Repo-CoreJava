package arrayPrograms;
import java.util.Scanner;

//FIBONACCI SERIES

public class A10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n term for fibonacci series");
	int n=sc.nextInt();
	int [] fibonacci=new int[n];
	fibonacci[0]=0;
	fibonacci[1]=1;
	for(int i=2;i<n;i++)
	{
		fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
	}
	System.out.println("Fibonacci series");
	for(int ele:fibonacci)
	{
		  System.out.print(ele+" ");
	}
	sc.close();
}
}
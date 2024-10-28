package arrayPrograms;

import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	final int size=sc.nextInt();
	//float type array
	float []f=new float[size];
	
	System.out.println("Enter "+size+" float elements");
	for (int i=0;i<=f.length-1;i++)//->correct 5-1=4
	{
		f[i]=sc.nextFloat();
	}
	
	//logic for sum
	int sum=0;
	for(float ele:f)
	{
		//sum=sum+ele;
		//or
		sum+=ele;
	}
	System.out.println("sum="+sum);
	
	//logic of average
	double avg=sum/size;
	System.out.println("Average="+avg);
	
	

	}
}

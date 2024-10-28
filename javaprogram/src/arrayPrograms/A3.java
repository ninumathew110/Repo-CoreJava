package arrayPrograms;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		final int size=sc.nextInt();
		//float type array
		float []f=new float[size];
		
		System.out.println("Enter"+size+"float elements");
		for (int i=0;i<=f.length-1;i++)//->correct 5-1=4
		{
			f[i]=sc.nextFloat();
		}
		System.out.println("Elements are=");
		for(float ele:f)
		{
			System.out.println(ele);
		}
	}

}

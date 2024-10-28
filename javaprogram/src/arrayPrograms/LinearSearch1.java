package arrayPrograms;

import java.util.Scanner;

public class LinearSearch1 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		final int size=sc.nextInt();
		
		//int type array
		int []f=new int[size];
		int k=0;
		
		System.out.println("Enter"+size+"int elements");
		for (int i=0;i<=f.length-1;i++)//
		{
			f[i]=sc.nextInt();//23 45 67 14 90
		}
		System.out.println("Enter the element to be searched in array");
		int searchNo=sc.nextInt();//45
		
		for(int i=0;i<f.length;i++)
		{
			if(f[i]==searchNo)
				k=1;//whenever search value is found ,k value will be 1.,how much evr the times if it finds the same elemnt again it gives k=1.
		}
		if (k==1)
			System.out.println("The search element is present in the array");
		else
			System.out.println("The search element is not present in the array");
}
}

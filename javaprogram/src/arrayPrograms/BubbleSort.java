package arrayPrograms;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	final int size=sc.nextInt();
	
	//int type array
	int []f=new int[size];
	
	System.out.println("Enter "+size+" int elements");
	for (int i=0;i<=f.length-1;i++)//
	{
		f[i]=sc.nextInt();
	}
	//loop  for number of passes
	
	for (int i=0;i<f.length-1;i++)
	{
		//another loop starts,it iterates over the array from first element to the element before the last sorted element which decreases with each iteration of the outer loop
		for(int j=0;j<f.length-i-1;j++)//last ele is not needed tosort again,so length-i-1(i is outer one)
		{
			//compare the adjacent element
			if(f[j]>f[j+1])
			//if(f[j]<f[j+1])->for decending order
			{
				//swap
				int temp=f[j];//temporay variable taken to store
				f[j]=f[j+1];//swapping
				f[j+1]=temp;
			}
		}
	
	}
System.out.println("Array elemnet in ascending order");
for(int ele:f)
	System.out.println(ele);
	
}
}
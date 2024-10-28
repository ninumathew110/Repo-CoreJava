package arrayPrograms;

import java.util.Scanner;

//to find index as well

public class LinearSearch2 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		final int size=sc.nextInt();
		
		//int type array
		int []f=new int[size];
		
		
		System.out.println("Enter"+size+"int elements");
		for (int i=0;i<=f.length-1;i++)//
		{
			f[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched in array");
		int searchNo=sc.nextInt();
		int index=linearSearch(f,searchNo);
		if(index==-1)
		System.out.println("The element is not present in the array ");
		else
			System.out.println(searchNo+"  is  present at position  "+index);
}
public static int linearSearch(int n[],int s)//n[]->value of array and s ->value of searchno
{
	for(int i=0;i<n.length;i++)
	{
		if(n[i]==s)
	{
		return i;
	}
	}
	return -1;//cant return 0,1,2...these all are positions in array,so took -1
	
	
}

}

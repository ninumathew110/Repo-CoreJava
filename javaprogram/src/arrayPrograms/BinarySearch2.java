package arrayPrograms;

import java.util.Scanner;

public class BinarySearch2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		final int size=sc.nextInt();
		
		//int type array
		int []f=new int[size];
		int start=0,last=f.length-1,mid=0,k=0;
		System.out.println("Enter "+size+" int elements");
		for (int i=0;i<=f.length-1;i++)//
		{
			f[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched in array");
		int searchNo=sc.nextInt();
		int index=binarySearch(f,start,last,searchNo);
		if(index==-1)
			System.out.println("The element is not present in the array ");
			else
				System.out.println(searchNo+" is  present in the array"+index);
	}
	public static int binarySearch(int n[],int s,int l,int sNo)
	{
		while(s<=l)//last can be start,but cannot be before start
		{
			int mid=(s+l)/2;
			if(sNo>n[mid])
				s=mid+1;
			if(sNo<n[mid])
				l=mid-1;
			if(sNo==n[mid])
			{
				return mid;
			}
		}
			return -1;
	
	
	
	
	}
}

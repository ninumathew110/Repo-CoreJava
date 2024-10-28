package arrayPrograms;

import java.util.Scanner;

//to search an element in an array

public class BinarySearch1 {
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
				
				while(start<=last)//last can be start,but cannot be before start
				{
					mid=(start+last)/2;
					if(searchNo>f[mid])
						start=mid+1;
					if(searchNo<f[mid])
						last=mid-1;
					if(searchNo==f[mid])
					{
						k=1;
						break;
					}
					}
				if(k==1)
					System.out.println("The element is not present in the array ");
					else
						System.out.println(" The element is  present in the array");
			}	
				
		}
	


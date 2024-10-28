package arrayPrograms;

public class A7 {
public static void main(String[] args) {
	int a[]= {14,-67,-9,678,57,40,89,33,27,-21,900,54,3,10,-112,234,77};
	//count even numbers in the array
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{ 
			count++;
		}
	}
	System.out.println("Total even numbers="+count);
	//count odd numbers in the array
	int count1=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{ 
			count1++;
		}
	}
	System.out.println("Total odd numbers="+count1);
	//count numbers which are divisible by 4
	int count2=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%4==0)
		{ 
			count2++;
		}
	}
	System.out.println("Total numbers divisible by 4="+count2);
	//count 3 digit numbers in the array
	int count3=0;
	for(int i=0;i<a.length;i++)
	{
		if((a[i]>=100 && a[i]<=999)||(a[i]>=-999 && a[i]<=-100))
		{ 
			count3++;
		}
	}
	System.out.println("Total 3 digit numbers="+count3);
	//count total numbers in the array ending with 7
			int count4=00;
			for(int i=0;i<a.length;i++)
			{
				if ( (a[i]%10==7)|| (a[i]%10==-7))
				{ 
					count4++;
				}
			}
		
			System.out.println("Total numbers ending with 7="+count4);
	
}
}
 
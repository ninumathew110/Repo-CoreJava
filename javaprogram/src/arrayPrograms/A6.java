package arrayPrograms;

public class A6 {
	public static void main(String[] args) {
		int a[]= {14,-67,-9,678,57,40,89,33,21,-21,900,54,3,10,-112,234,71};
		//sum of even numbers
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{ 
				sum+=a[i];
			}
		}
		System.out.println("Sum of even numbers="+sum);

		//sum of odd numbers
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{ 
				sum1+=a[i];
			}
		}
		System.out.println("Sum of odd numbers="+sum1);
         //sum of 2 digit numbers
		int sum2=0;
		for(int i=0;i<a.length;i++)
		{
			if((a[i]>9 && a[i]<100)||(a[i]<-9 &&  a[i]>-99))
			{ 
				sum2+=a[i];
			}
		}
		System.out.println("Sum of 2 digit numbers="+sum2);

		//sum of +ve number
		int sum3=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{ 
				sum3+=a[i];
			}
		}
		System.out.println("Sum of positive numbers="+sum3);

		//sum of -ve number
		int sum4=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{ 
				sum4+=a[i];
			}
		}
		System.out.println("Sum of negative numbers="+sum4);

		//prod of even numbers
		int prod=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{ 
				prod*=a[i];
			}
		}
		System.out.println("Product of even numbers="+prod);

		//prod of odd numbers
		int prod1=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{ 
				prod1*=a[i];
			}
		}
		System.out.println("Product of odd numbers="+prod1);

		//prod of 2 digit numbers
		int prod2=1;
		for(int i=0;i<a.length;i++)
		{
			if((a[i]>9 &&a[i]<100)||(a[i]<-9 &&  a[i]>-99))
			{ 
				prod2*=a[i];
			}
		}
		System.out.println("Product of 2 digit numbers="+prod2);

		//prod of +ve number
		int prod3=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{ 
				prod3*=a[i];
			}
		}
		System.out.println("Product of positive numbers="+prod3);

		//prod of -ve number
		int prod4=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{ 
				prod4+=a[i];
			}
		}
		System.out.println("Product of negative numbers="+prod4);
	}
}
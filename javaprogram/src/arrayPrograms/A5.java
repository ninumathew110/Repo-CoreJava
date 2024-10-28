package arrayPrograms;

public class A5 {
	public static void main(String[] args) {
		
		int a[]= {14,-67,-9,678,57,40,33,21,-21,900,54,3,10,-112,234,71};
		//even numbers
		System.out.println("even nos are");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		//odd numbers
		System.out.println("odd nos are");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		//number at even index in array
		System.out.println("Number present at even index");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				System.out.println(a[i]);
		}
		//number at odd index in array
				System.out.println("Number present at odd index");
				for(int i=0;i<a.length;i++)
				{
					if(i%2!=0)
						System.out.println(a[i]);
				}
				
			//print 2 digit numbers from the array
				System.out.println("2 digit nos from the array");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]>9 && a[i]<100)
						System.out.println(a[i]);
				
				}
				//print only positive numbers
				System.out.println("print only positive number");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]>0)
						System.out.println(a[i]);

				}
				//print only negative numbers
				System.out.println("print only negative number");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]<0)
						System.out.println(a[i]);

				}
				//print the numbers divisible by 3
				System.out.println("print the numbers divisible by 3");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%3==0)
						System.out.println(a[i]);

				}
				
}
}
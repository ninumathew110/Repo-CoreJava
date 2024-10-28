package arrayPrograms;

public class A1 {
	public static void main(String[] args) {
		//declare and instantiate
		//int [] n=new int[-5];//-ve arraysize exception,we should not create array with -ve size
		//n is array reference variable of int type where we store reference
		int [] n=new int[5];
		//initialise the value of array
		n[0]=12;
		n[1]=34;
		n[2]=10;
		n[3]=89;
		n[4]=100;
		//n[5]=36;//ArrayIndexOutOfBoundsException->not place to store
		
		//accessing elements from the array
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		//System.out.println(n[8]);//ArrayIndexOutOfBoundsException
		
		// length variable(to find size of an array)
	
		System.out.println("Array size="+n.length);
		//or
		int len=n.length;
		System.out.println("Array size="+len);
		
		//for-each loop
		System.out.println("Elements of the arraya are=");
		for(int ele:n)
		{
			System.out.println(ele);
		}
		
		
	}

}

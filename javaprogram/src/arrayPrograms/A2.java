package arrayPrograms;

public class A2 {
	public static void main(String[] args) {
		
		String[] fruits= {"Apple","Banana","Mangoes","pinapple","watermelon"};
		System.out.println("size="+fruits.length);
		System.out.println("fruits are:-");
		for(String ele:fruits)
		{
			System.out.print(ele+" ");
		}
		//or
		System.out.println();
		System.out.println("Elements of array fruits are:-");
		//for(int i=0;i<=4;i++)
		//or
		for(int i =0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
			//Apple
			//Banana
			//Mangoes
			//pinapple
			//watermelon
		}
			
	}

}

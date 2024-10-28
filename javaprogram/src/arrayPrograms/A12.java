package arrayPrograms;

//ARRAY ELEMENT IS PALINDROME OR NOT

public class A12 {
	public static void main(String[] args) {
		int[]n= {22,34,56,56,34,22};//change 21 ,then gets not palindrome o/p
		if(palindrome(n))
			System.out.println("Array is palidrome");
		else
			System.out.println("Array is not palindrome");
	}
		
		public static boolean palindrome(int[] num)
		{
			int left=0;//taking 1st LHS digit
			int right=num.length-1;//to take RHS digit
			while(left<right)//LHS index value will be always less than RHS index value
			{
				if(num[left]!=num[right])
				{
					return false;
				}
				left++;//to increase left hand side
				right--;
			}
		return true;
		
		}
	}
		



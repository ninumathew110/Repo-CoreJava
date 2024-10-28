package stringProgram;
//imp question
public class StringPalindrome {
//palindrome means original string and reversed string will be same
	public static void main(String[] args) {
		String str="Core Java";//reverse variable
		String rev="";
		System.out.println("Original String="+str);
		for(int i=str.length()-1;i>=0;i--)//9-1=8,8>=0T,8-1=7>=0T 6>=0t
		{
		rev=rev+str.charAt(i);//""+a=a a+v=av av+a=ava ava+J=avaJ...
	}
		System.out.println("Reverse String="+rev);
	
	
}
}
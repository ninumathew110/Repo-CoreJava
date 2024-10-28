package stringProgram;
//imp question
public class StringReverse {
	public static void main(String[] args) {
		String str="Madam";//reverse variable
		String rev="";
		System.out.println("Original String="+str);
		for(int i=str.length()-1;i>=0;i--)//9-1=8,8>=0T,8-1=7>=0T 6>=0t
		{
		rev=rev+str.charAt(i);//
	}
		System.out.println("Reverse String="+rev);
		if(str.equals(rev))
			System.out.println("Palindrome String");
		else
			
			System.out.println("Not a Palindrome String");
}
}
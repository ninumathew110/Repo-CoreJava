package wrapperClassPrograms;

public class StringCovertToPrimitiveValue {
	public static void main(String[] args) {
		
		String str1="1234";
		int i=Integer.parseInt(str1);// java.lang.NumberFormatException,will come if we give string instead of numbers
		System.out.println(str1);
		System.out.println(i);
		
		String str2="34576871655";
		long l=Long.parseLong(str2);
		System.out.println(str2);
		System.out.println(l);
	
		String str3="43563.9877";
		float f=Float.parseFloat(str3);
		System.out.println(str3);
		System.out.println(f);

		String str4="String";
		boolean b=Boolean.parseBoolean(str4);
		System.out.println(str4);
		System.out.println(b);
		
		String s1="65";
		char ch=(char)Integer.parseInt(s1);//(char)65
		System.out.println(s1);
		System.out.println(ch);
		
		String s2="Hello";
		char ch1=s2.charAt(4);
		System.out.println(s2);
		System.out.println(ch1);
		
		
		
	}

}

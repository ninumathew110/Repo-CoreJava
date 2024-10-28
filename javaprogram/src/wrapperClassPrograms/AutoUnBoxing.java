package wrapperClassPrograms;

public class AutoUnBoxing {
public static void main(String[] args) {
		
		Integer i1=10;//non-primitive values
		int i=i1;
		System.out.println("primitive value="+i);
		System.out.println("non-primitive value="+i1);//object
		
		Double d1=345.677;
		double  d=d1;
		System.out.println("primitive value="+d);
		System.out.println("non-primitive value="+d1);//object
		

		Character  ch1='l';
		char ch=ch1;
		System.out.println("primitive value="+ch);
		System.out.println("non-primitive value="+ch1);//object
		
		Boolean b1 =true;
		boolean b=b1;
		System.out.println("primitive value="+b);
		System.out.println("non-primitive value="+b1);//object
		
	}

}

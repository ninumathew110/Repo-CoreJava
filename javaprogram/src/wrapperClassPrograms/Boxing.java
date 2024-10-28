package wrapperClassPrograms;

public class Boxing {
public static void main(String[] args) {
	
	int i=23;//primitive values
	Integer i1=Integer.valueOf(i);//non-primitive value
	System.out.println("primitive value="+i);
	System.out.println("non-primitive value="+i1);//object
	
	double d=4567.123;
	Double d1=Double.valueOf(d);
	System.out.println("primitive value="+d);
	System.out.println("non-primitive value="+d1);//object
	

	char ch='r';
	Character ch1=	Character.valueOf(ch);
	System.out.println("primitive value="+ch);
	System.out.println("non-primitive value="+ch1);//object
	
	boolean b=true;
	Boolean b1=	Boolean.valueOf(b);
	System.out.println("primitive value="+b);
	System.out.println("non-primitive value="+b1);//object
	
}
}

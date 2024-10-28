package isARelationship;

public class XYDriver {
	public static void main(String[] args) {
	Y obj1=new Y();//child class
	System.out.println(obj1.j);
	System.out.println(obj1.i);
	System.out.println();
	
	System.out.println(Y.e);
	System.out.println(Y.f);
	Y.m1();//static memebers of parent class
	Y.m2();////static memebers of child class
	System.out.println(obj1.e);
	System.out.println(obj1.f);
	obj1.m1();
	obj1.m2();

	X obj2=new X();//parent
	System.out.println(obj2.i);
	//System.out.println(obj1.j);//CTE,parent cant access child class
	System.out.println(X.e);	
	X.m1();
	//X.m2();//CTE,parent cant access child class
	//	System.out.println(X.f));//CTE
	}
	
	}

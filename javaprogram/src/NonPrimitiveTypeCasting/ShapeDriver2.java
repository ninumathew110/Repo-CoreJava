package NonPrimitiveTypeCasting;

public class ShapeDriver2 {
public static void main(String[] args) {
	Shape s1= new Shape(23.8);
	System.out.println(s1.area);
	System.out.println(s1 instanceof Circle);
	System.out.println(s1 instanceof Shape);
	//System.out.println((Circle)s1);//CTS,but we will classcastexception,since rule is not followed

	}
}

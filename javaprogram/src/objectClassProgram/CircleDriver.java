package objectClassProgram;

public class CircleDriver {
public static void main(String[] args) {
	Circle c=new Circle(9);
	Circle c1=new Circle(9);
	System.out.println(c);//c.toString()
	System.out.println(c1);//c.toString()
	System.out.println(c.equals(c1));
	System.out.println(c.hashCode()==c1.hashCode());
	
	}
}

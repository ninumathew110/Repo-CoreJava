package NonPrimitiveTypeCasting;

public class ShapeDriver {
	public static void main(String[] args) {
		Circle c1= new Circle(12.0,4.67);
		System.out.println(c1.area);//inherited property
		System.out.println(c1.radius);//address of parent
		Shape s1=c1;//UPCASTING,has-a-relationship(so can be connected)
		System.out.println(s1.area);//child->parent
		//System.out.println(s1.radius);//parent->child(again cant do)
		
		//Circle c2=s1;//generally parent can become a child again,so
		Circle c2=(Circle)s1;////DOWNCASTING 
		System.out.println(c1 instanceof Circle);
		System.out.println(s1 instanceof Circle);
		System.out.println(c1 instanceof Shape);
		System.out.println(s1 instanceof Shape);
		System.out.println(c2 instanceof Circle);
		System.out.println(c2 instanceof Shape);
		
		c1=(Circle)s1;//DOWNCASTING 
		System.out.println(c2.radius);
		System.out.println(c1.radius);
		
		Shape sh=new Circle(23.9,12.0);//upcasting
		Circle c3=(Circle)sh;//downcasting
		System.out.println(sh instanceof Circle);
		System.out.println(sh instanceof Shape);
		System.out.println(c3 instanceof Circle);
		System.out.println(c3 instanceof Shape);
	}

}

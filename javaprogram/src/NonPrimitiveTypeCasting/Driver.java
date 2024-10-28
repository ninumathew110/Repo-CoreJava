package NonPrimitiveTypeCasting;

public class Driver {
	public static void main(String[] args) {
		Apple a1=new Apple(10),a2,a4;
		a2=a1;
		a4=a1;
		Apple a3=new Apple(30);
		//Carrot C1=a1;//CTE,carrot not having relationshipto apple
		System.out.println(a1==a2);//case 1 in understanding reference variable
		System.out.println(a1==a3);//even if there are same class,belongs to different address.
		System.out.println(a1==a4);
		
		
		
		
	}

}

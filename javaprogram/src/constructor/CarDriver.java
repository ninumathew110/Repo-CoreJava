package constructor;

public class CarDriver {
	public static void main(String[] args)
	{
		Car c1=new Car();//no argument constructor load NSM ,Execute NSI,execute PWI
		c1.display();
		
		System.out.println("*******");
		Car c2=new Car("BMW","Pearl black",750000.0);
		c2.display();
		
		System.out.println("*******");
		Car c3=new Car("Maruti");
		c3.display();
		
		System.out.println("*******");
		Car c4=new Car(1500000.0);
		c4.display();
		
		System.out.println("*******");
		Car c5=new Car("Taigun",20000.0);
		c5.display();
		
				
			
	}

}

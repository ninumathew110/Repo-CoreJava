package constructor;

public class Car {
//non static  variables
	String brand;
	String color;
	double price;
	
	static
	{
		System.out.println("static initializer");
	}
	
	{
		System.out.println("Non static initializer");
	}
	//no argument constructor
	
	public Car()
	{
		System.out.println("no argument constructor");//program written instructions
	}
	//parameterised constructor
	
	public Car(String brand)
	{
		this.brand=brand;//programmer written instruction
	}
	public Car(double price)
	{
		this.price=price;
	}
	public Car(String brand,String color)
	{
		this(brand);//programmer written instruction
		this.color=color;
	}
	public Car(String brand,double price)
	{
		this(price);
		this.brand=brand;
	}
	public Car(double price,String color)
	{
		
		this(price);
		this.color=color;
	}
	
	public Car(String brand,String color,double price)
	//  "BMW", "Pearl Black",7500000.0
	{
		this(brand,color);
		this.price=price;
	}
	//non static method
		public void display()
		{
			System.out.println("car brand="+this.brand);
			System.out.println("car color="+this.color);
			System.out.println("car price="+this.price);
		}
}

package constructor;

public class Duster {
	//non static variable
	double price;
	String color;
	String brand;
	//constructor overloading,chaining
	Duster(double price)
	{
		this.price=price;
	}
	Duster(String color)
	{
		this.color=color;
	}
	Duster(double price,String color)
	{
		this(price);
		this.color=color;
	}
	Duster(String brand,String color)
	{
		this(color);
		this.brand=brand;
	}
	Duster(String brand,double price)
	{
		this(price);
		this.brand=brand;
	}
	Duster(double price,String color,String brand)
	{
		this(price,color);
		this.brand=brand;
	}
	//non static method
	public void display()
	{
		System.out.println("Duster Price="+this.price);
		System.out.println("Duster color="+this.color);
		System.out.println("Duster brand="+this.brand);
	}
}

package nonstaticprogram;

public class Mobile {
	//non static variable
	String brand;
	double price;
	int ram;
	int rom;
	
	//first static will execute then only non-static gets executed

	//single line non static initializer
	String location="india";
	
	//multiline static initializer
	static
	{
		System.out.println("******Mobile class******");
		
	}
	//multiline non static initializer
	{
		System.out.println("Detail of all mobile object");
	}
	
	//non static methods
	public void setProperty(String brand,double price,int ram,int rom)
	{
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
	}
	
	public void display()
	{
		System.out.println("mobile brand="+this.brand);
		System.out.println("mobile price="+this.price);
		System.out.println("mobile ram="+this.ram);
		System.out.println("mobile rom="+this.rom);
		
	}
	//multiline non static initializer
	{
		System.out.println(location);
		
	}

}


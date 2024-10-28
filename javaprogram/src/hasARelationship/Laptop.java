package hasARelationship;

public class Laptop {
	//non static variable
	String brand;
	String color;
	double price;
	int ram;
	int rom;
	private Charger c;
	//constructor
	public Laptop(String brand,String color, double price, int ram, int rom,Charger c) {
			this.brand = brand;
			this.color=color;
			this.price = price;
			this.ram = ram;
			this.rom = rom;
			this.c=c;//early instantiation
			}
	public Charger getCharger()
	{
		return c;
	}
	//public void insert(Charger c)//helper method
	//{
		//if(this.c<=14.5)//verification
		//{
			//this.c=c;
			//System.out.println(" Use this charger");
		//}
	//else
		//System.out.println("Dont use this charger");
	//} 
	
	//non-static methods
public void display(){
	System.out.println("Laptop brand="+this.brand);
	System.out.println("Laptop color="+this.color);
	System.out.println("Laptop price="+this.price);
	System.out.println("Laptop RAM="+this.ram);
	System.out.println("Laptop ROM="+this.rom);
	}
	

			

}

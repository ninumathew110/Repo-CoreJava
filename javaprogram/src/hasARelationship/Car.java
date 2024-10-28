package hasARelationship;

public class Car {
	String brand;
	String color;
	double price;
	private Engine e;//instance var of engine class(new line added)
	//constructor
	public Car(String brand, String color, double price,Engine e) {
		//       ( "Taigun","Black",210000.0,ac12df)
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.e=e;//early instantiation(new line added)with the help of constructor
	}
	//establish relationship between car & engine
	//has a relationship->using early instantiation
	//with the help of initilizer
	//Engine e(non-static var)
	//private Engine e=new Engine(1000);//load NSM,execute NSI,programmer execute Programmer written instruction(PWI)
	//			datatype=reference[hidden after newline added]
	//getter for engine instance variable
	public Engine getEngine()
	{
		return e;//returning address of an engine(non-primitive)
	}
	
	//non-static methods
	public void display()
	{
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.price);
	}
}

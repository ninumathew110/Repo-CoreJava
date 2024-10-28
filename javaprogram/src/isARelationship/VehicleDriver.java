package isARelationship;

public class VehicleDriver {
public static void main(String[] args) {
	PulserNS obj1=new PulserNS(78000.0,2);
	System.out.println("price of pulser NS="+obj1.price);
	
	Bike b1=new Bike(45000.0,2);
	System.out.println("price for bike="+b1.price);
	System.out.println("Total noof wheels="+b1.noOfWheels);
	
	Car c1=new Car(50000.0,4);
	System.out.println("price for car="+c1.price);
	System.out.println("Total noof wheels="+c1.noOfWheels);
	
	Bus b2=new Bus(300000.0,6);
	System.out.println("price for bus="+b2.price);
	System.out.println("Total noof wheels="+b2.noOfWheels);
	
}

}

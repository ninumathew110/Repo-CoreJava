package interfacePrograms;

public class VehicleDriver {
	public static void main(String[] args) {
		
		Vehicle v1=new Car(4,"pearl black");
		System.out.println("No of wheels in a car="+v1.getOfWheels());
		System.out.println("car color="+v1.getColor());
		v1.start();
		v1.stop();
		
		Vehicle v2=new Bike(2,"Blue");
		System.out.println("No of wheela in a bike="+v2.getOfWheels());
		System.out.println("Bike color="+v2.getColor());
		v2.start();
		v2.stop();
	}

}

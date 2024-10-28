package hasARelationship;

public class CarDriver {
	public static void main(String[] args) {
	Car c1=new Car("Taigun","black",210000.0,new Engine(1000.0));//load NSM,execute all NSI,execute PWI
	c1.display();
		System.out.println(c1.getEngine().getCC());//only one object is created,we can create more
	}

}

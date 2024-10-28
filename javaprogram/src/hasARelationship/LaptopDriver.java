package hasARelationship;
public class LaptopDriver {
		public static void main(String[] args) {
			Laptop a1=new Laptop("HP","Silver",45000.0,6,256,new Charger(19.5,45));
			//a1.insert(new Charger(19.5,45));
			a1.display();
			System.out.println("volt="+a1.getCharger().getVolt());
			System.out.println("watss"+a1.getCharger().getWatt());
		}
	
}
 



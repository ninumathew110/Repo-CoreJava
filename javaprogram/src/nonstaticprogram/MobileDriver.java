package nonstaticprogram;

public class MobileDriver {
	public static void name(String[]args) {
		Mobile obj1=new Mobile();//object created,load NSM and execute NSI
		obj1.setProperty("vivo",11000.0,4,123);
		obj1.display();
		
		Mobile obj2=new Mobile();
		obj2.setProperty("samsung",23000.0,8,256);
		obj2.display();
		
		Mobile obj3=new Mobile();
		obj3.setProperty("Nokia",15673.0,4,156);
		obj3.display();
	}

}

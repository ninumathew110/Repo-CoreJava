package constructor;

public class DusterDriver {
	public static void main(String[] args) {
		Duster d1=new Duster(120.0);
		d1.display();
		System.out.println("************");
		Duster d2=new Duster("Black");
		d2.display();
		System.out.println("************");
		Duster d3=new Duster(110.50,"Blue");
		d3.display();
		System.out.println("************");
		Duster d4=new Duster("Camline","Red");
		d4.display();
		System.out.println("************");
		Duster d5=new Duster("Classmate",290.89);
		d5.display();
	}

}

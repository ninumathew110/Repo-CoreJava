package hasARelationship;

public class AeroplaneDriver {
	public static void main(String[] args) {
		Aeroplane a1=new Aeroplane("AirIndia","White",500,new JetFuel(150000.0));//load NSM,execute all NSI,execute PWI
		a1.display();
			System.out.println(a1.f.litres);
		}

	}



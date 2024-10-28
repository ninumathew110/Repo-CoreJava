package hasARelationship;
import encapsulation.Sim;//to call old sim program

public class MobileDriver {
public static void main(String[] args) {
		Mobile m1=new Mobile("Samsung",21000.0,8,256);
		m1.insert(new Sim("Airtel",987654321L,118.0));
		m1.display();
	}

}

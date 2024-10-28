package encapsulation;

public class SimDriver {
	public static void main(String[] args) {
		Sim s1=new Sim("Airtel",987654321L,118.0);
		//s1.dsplay();
		System.out.println(s1.getServiceProvider());
		System.out.println(s1.getsimNo());
		System.out.println(s1.getbal());
		s1.setServiceProvider("vodaphone");
		s1.setSimNo(779854321L);
		s1.setBal(189.90);
		s1.display();	
	}

}

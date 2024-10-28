package interfacePrograms;

public class SamsungDriver {
	public static void main(String[] args) {
		
		Samsung s1=new Samsung();
		s1.powerOff();
		s1.powerOn();
		s1.makeCall();
		s1.sendMessages();
		
		
		Phone p1=new Samsung();//upcasting
		p1.makeCall();
		p1.sendMessages();
		ElectronicDevice e1=(ElectronicDevice)p1;//downcasting
		e1.powerOff();
		e1.powerOn();
		
		ElectronicDevice e2=new Samsung();//upcasting
		e2.powerOff();
		e2.powerOn();
		Phone p2=(Phone)e2;//downcasting
		p2.makeCall();
		p2.sendMessages();
	
	}

}

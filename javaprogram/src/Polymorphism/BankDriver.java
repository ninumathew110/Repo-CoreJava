package Polymorphism;

public class BankDriver {
	public static void main(String[] args) {
		Bank s1=new SBI();//upcasting
		System.out.println(s1.getRateOfInterest());//when executes child class will get written
		
		Bank b2=new ICICI();//UPCASTING
		System.out.println(b2.getRateOfInterest());//when executes child class will get written
		
		Bank b3=new AXIS();//UPCASTING
		System.out.println(b3.getRateOfInterest());//when executes child class will get written
	}
}

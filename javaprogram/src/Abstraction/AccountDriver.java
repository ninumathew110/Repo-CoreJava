package Abstraction;

public class AccountDriver {
	public static void main(String[] args) {
		Account s1=new SavingAccount("SA123",100000,500);//upcasting
		s1.displayBalance();
		s1.deposit(1000);
		s1.displayBalance();
		s1.withdraw(2000);
		s1.displayBalance();
		SavingAccount s2=(SavingAccount)s1;//downcasting
		s2.CalculateInterest();
		s2.displayBalance();
		
		
	}

}

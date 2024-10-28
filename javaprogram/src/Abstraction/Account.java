package Abstraction;
<<<<<<< HEAD
//for github
=======

>>>>>>> branch 'master' of https://github.com/ninumathew110/Repo1.git
abstract public class Account {
	 String accountNumber;
	 double balance;
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	//abstract methods
	public abstract  void deposit(double amount);
	public abstract  void withdraw(double amount);
	
	//concrete method
	public void displayBalance()
	{
		System.out.println("Account Number="+accountNumber);
		System.out.println("Balance="+balance);
	}

}

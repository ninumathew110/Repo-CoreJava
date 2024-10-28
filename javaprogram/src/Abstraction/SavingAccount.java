package Abstraction;

public class SavingAccount extends Account {
	private double interestRate;
	
	//constructor
	public SavingAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	//method to calculate the interest
	public void CalculateInterest()
	{
		double interest=balance*interestRate/100;
		balance+=interest;
		System.out.println("Interest calculated="+interest);
	}
	//implementing abstract methods of Account class
	@Override
	public   void deposit(double amount)
	{
		balance+=amount;
		System.out.println(amount+"is deposited successfully");
		
	}
	@Override
	public   void withdraw(double amount)
	{
		if(balance>=amount)
		{
		balance-=amount;
		System.out.println(amount+"is withdrawed successfully");
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}	
	
	}

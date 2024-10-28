package exceptionHandlingPrograms;

public class BankAccount {
private double balance;
//getter
public double getBalance()
{
	return balance;
}
public BankAccount(double balance)
{
	this.balance=balance;
}
public void deposit(double amount)
{
	if(amount>0)
	{
		balance+=amount;
		System.out.println("Deposited money="+amount);
		System.out.println("Current balance="+balance);
	}
	else
	{
		System.out.println("Deposite amount must be positive amount");
	}
}

public void withdraw(double amount)throws InsufficientFundsException
{
	if(amount>balance)
	{
		throw new InsufficientFundsException("Insufficient balance!!\n Current balance="+balance);
	}
	else
	{
		balance-=amount;
		System.out.println("Withdrew money="+amount);
		System.out.println("Current balance="+balance);
	}
}





}
 
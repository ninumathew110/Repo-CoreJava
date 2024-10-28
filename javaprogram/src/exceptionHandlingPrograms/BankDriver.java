package exceptionHandlingPrograms;

public class BankDriver {
public static void main(String[] args) {
	BankAccount account=new BankAccount(1000.0);
	//deposite money
	account.deposit(1000.0);
	try
	{
	account.withdraw(500.0);
	account.withdraw(2000);
	}
	catch(InsufficientFundsException e)
	{
		System.out.println("InsufficientFundsException handled");
	}
	finally
	{
		System.out.println("Finalbalance="+account.getBalance());
	}
}
}
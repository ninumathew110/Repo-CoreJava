package Abstraction;

public class CurrentAccount extends Account{
	
		private double overDraftLimit;
		
		//constructor
		public CurrentAccount(String accountNumber, double balance, double overDraftLimit) {
			super(accountNumber, balance);
			this.overDraftLimit = overDraftLimit;
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
			if(balance+overDraftLimit>=amount)
			{
			balance-=amount;
			System.out.println(amount+"is withdrawed successfully");
			}
			else
			{
				System.out.println("Transaction declined!!overdraft limit exceeds");
			}
		}	
		
		
	}




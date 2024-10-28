package encapsulation;

public class Sim {
	//non static var
	//data hiding
	private String serviceProvider;//declaring
	//getter
	public String getServiceProvider()
	{
		return serviceProvider;
	}
	//setter(used for changing)
	public void setServiceProvider(String serviceProvider)//string is a local variable ,taken to store new value
	{
		this.serviceProvider=serviceProvider;//setting the data
	}
	private long simNo;//declaration
	//always use long for mob nos and contact no,int wont be always suitable
	//getter
	public long getsimNo()
	{
		return simNo;
	}
	//setter
	public void setSimNo(long simNo)
	{					//7798543218L
		this.simNo=simNo;
	}
	private double balance;//declaration
	//getter
	public double getbal()
	{
		return balance;
	}
	//setter
	public void setBal(double balance)
	{					//189.90
		this.balance=balance;
	}
	//parameterised constructor
	public Sim(String serviceProvider,long simNo,double balance)
	{				//"Airtel",987654321L,118.0
		this.serviceProvider=serviceProvider;
		this.simNo=simNo;
		this.balance=balance;
	}
	//non static methods
	public void display()
	{
		System.out.println("service provider="+this.serviceProvider);
		System.out.println("sim number="+this.simNo);
		System.out.println("sim balance="+this.balance);
	}
	
}

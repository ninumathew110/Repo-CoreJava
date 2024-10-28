package interfacePrograms;

public class Bike implements Vehicle {
	private int noOfWheels;
	private String color;
	//constructor
	public Bike(int noOfWheels,String color)
	{
		this.noOfWheels=noOfWheels;
		this.color=color;
	}
@Override
	public int getOfWheels()
	{
		return noOfWheels;
	}
@Override
public String getColor()
{
	return color;
}
@Override
public void start()
{
	System.out.println("Bike started");
}
@Override
public void stop()
{
	System.out.println("Bike stopped");
}

	
}

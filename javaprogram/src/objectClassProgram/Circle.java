package objectClassProgram;

import java.util.Objects;

public class Circle {
	int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public String toString()
	{
		return "Radius="+radius;//concate the value of radius ,making the int value to string 
		
	}
	
	@Override
	public boolean equals(Object obj)//UPCASTING,address of b2(child) given to obj,but it is converted to obj(parent),so UPCASTING
	{//compare the state instead of comparing the address
		//DOWNCASTING
		Circle temp=(Circle)obj;//temp->address of b2,
		if(this.radius==temp.radius)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(radius);
	}
	
	//public static void main(String[] args) {	
	//Circle c=new Circle(9);
	//System.out.println(c);//in c address of tostring method get overridden by the address of circle class tostring method
	
	}

	



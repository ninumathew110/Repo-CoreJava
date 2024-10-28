package objectClassProgram;

import java.util.Objects;

public class Book {
	String title;
	double price;
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
@Override
public String toString()
{
	return "Book Tile"+"\n"+"Book price="+price;
}
@Override
public boolean equals(Object obj)//UPCASTING,address of b2(child) given to obj,but it is converted to obj(parent),so UPCASTING
{//compare the state instead of comparing the address
	//DOWNCASTING
	Book temp=(Book)obj;//temp->address of b2,
	if(this.title==temp.title && this.price==temp.price)//equals method,b1.title==b2.title && b1.price==b2.price
		return true;
	else
		return false;
}
	@Override
	public int hashCode()
	{
		return Objects.hash(title,price);
	}
	
}

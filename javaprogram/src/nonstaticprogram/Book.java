package nonstaticprogram;

public class Book {
//non static variable
	String author;//null
	String title;//null
	double price;//0.0
	//single line non-static initializer
	String companyName="NavNeet Publication";//null,NavNeet Publication
	
	//Multiline non static initializer
	{
		System.out.println(companyName);
	}
	
	//non static method->this keyword
	public void display()
	{
		System.out.println(author);
		System.out.println(title);
		System.out.println(price);
	}
	//non static method-->this keyword
	public void setProperty(String author,String title,double price)
	{
		this.author=author;//50040f0c.author=ABC 2dda6444.author=DEF
		this.title=title;//50040f0c.title=Hello  2dda6444.tilte=Good morning
		this.price=price;//50040f0c.price=230.89  2dda6444.price=471.50
	}
}
//ctrl+shift+plus sign(for zoom in)
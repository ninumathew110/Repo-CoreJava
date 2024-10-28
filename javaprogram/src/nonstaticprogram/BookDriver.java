package nonstaticprogram;

public class BookDriver {
public static void main(String[] args) {
	Book b1=new Book();//load NSM(non-static member,execute NSI(non static initializer)
	System.out.println(b1);
	b1.setProperty("ABC","Hello",230.89);//method call statement
	b1.display();
	//System.out.println(b.author);//ABC
	//System.out.println(b.price);//Hello
	//System.out.println(b.title);//230.89
	//instead of writing all above, simply display with a single command(b.display()),but its cant be called again 

	Book b2=new Book();
	System.out.println(b2);
	b1.setProperty("DEF","Good Morning",471.50);//method call statement
	b2.display();
}
}

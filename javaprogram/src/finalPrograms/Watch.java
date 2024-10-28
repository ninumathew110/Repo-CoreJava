package finalPrograms;

final public class Watch {
	final double price=20000.0;//final variable,final must be initialised
	final void  change()
	{
		//price=32000.0;//the final field price cannot be changed
		System.out.println("change() from watch");
	}
}

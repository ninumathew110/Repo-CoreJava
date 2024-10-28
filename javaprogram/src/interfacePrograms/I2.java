package interfacePrograms;

public interface I2 extends I1 {
	/*I2()//Interfaces cannot have constructors
	{
		
	}*/
	//abstract non static method
		void a1();//[Abstract methods do not specify a body]
		
	//static concrete method->it cannot be overridden
		static void a2()
		{
			System.out.println("static method a2 from interface I1");
		}

	//public static final variable
		 String test="Good morning";
		
} 
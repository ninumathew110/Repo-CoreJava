package interfacePrograms;

public interface I1 {
	//abstract non static method[public]
		void m1();//[Abstract methods do not specify a body]
		
	//static concrete method->it cannot be overridden
		static void m2()
		{
			System.out.println("static method m2from interface I1");
		}

	//public static final variable
		 String code="Hello";
		
	} 
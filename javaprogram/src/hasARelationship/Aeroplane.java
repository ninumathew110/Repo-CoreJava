package hasARelationship;

public class Aeroplane {
	String company;
	String color;
	int capacity;
	 JetFuel f;//instance var of JetFuel class
	
	//parameterised constructor
	public Aeroplane(String company, String color, int capacity,JetFuel f) {
		//			("AirIndia","White",500,@2dda6444)
		
		this.company = company;
		this.color = color;
		this.capacity = capacity;
		this.f=f;//early instantiation
	}
	
	//JetFuel f(non-static var)
	//public JetFuel f=new JetFuel(150000.0);//load NSM((non-static member),execute NSI(non-static initializer),
													//programmer executes Programmer written instruction(PWI)
	
		
	
		{
			if(this.f==null)//verification
			{
				this.f=f;
				System.out.println("Sufficient fuel filled");
			}
		else
			System.out.println("Sufficient fuel not filled");
		}

	//non-static methods
	public void display()
	{
		System.out.println(this.company);
		System.out.println(this.color);
		System.out.println(this.capacity);
		
			if(this.f==null)//verification
			{
				this.f=f;
				System.out.println("Sufficient fuel filled");
			}
		else
			System.out.println("Sufficient fuel not filled");
		}
	}





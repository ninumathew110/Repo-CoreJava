package hasARelationship;

import encapsulation.Sim;//to call old sim program
public class Mobile {
	//instance variable of sim object
	Sim s;
	//non static variable
		String brand;
		double price;
		int ram;
		int rom;
		
		//constructor
		public Mobile(String brand, double price, int ram, int rom) {
			this.brand = brand;
			this.price = price;
			this.ram = ram;
			this.rom = rom;
		}
		public void insert(Sim s)//helper method
		{
			if(this.s==null)//verification
			{
				this.s=s;
				System.out.println("New sim inserted");
			}
		else
			System.out.println("Already sim Exits");
		}
		public void display()
		{

			System.out.println("Mobile brand="+this.brand);
			System.out.println("Mobile price="+this.price);
			System.out.println("Mobile RAM="+this.ram);
			System.out.println("Mobile ROM="+this.rom);
			if(this.s==null)//verification
			{
				System.out.println("NO SIM FOUND");
			}
			else 
				s.display();
		}

		
		}

	
	
	



		
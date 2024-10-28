package hasARelationship;

public class Charger {
	private double volt;//it a fixed value,so cannot be changed so only getter method,no setter method
	//getter
		public double getVolt()
		{
			return volt;
		}
		
		private int watts;
		public int getWatt()
		{
			return watts;
		}
	//constructor
		Charger(double volt,int watts)
		{
			this.volt=volt;//19.5
			this.watts=watts;//45
		}
}	


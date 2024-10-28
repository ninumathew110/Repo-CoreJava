package arrayPrograms;

public class A8 {
public static void main(String[] args) {
	int n[]= {25,87,10,76,9};
	//find max and min
	int max=n[0];//25 87
	int min=n[0];//25 10 9
	for(int i=0;i<n.length;i++)
	{
		if(n[i]>max)//25>25f 87>25t 10>87f 76>87f 9>89f
			max=n[i];//max->87
		
		if(n[i]<min)//25<25f 87<25f 10<25t 76<10f 9<10t
			min=n[i];//min->9
			
	}
	System.out.println("Max="+max);
	System.out.println("Min="+min);
}
}
 
package arrayPrograms;
//to find duplicate nos
public class A9 {
public static void main(String[] args) {
	int n[]= {13,12,45,67,13,45,13,77,20,77};//13 13 45 13 77
	System.out.println("Duplicate elements in the array are");
	for(int i=0;i<n.length;i++)
	{
		for(int j=i+1;j<n.length;j++)
		{
			if(n[i]==n[j])
				System.out.println(n[j]);
		}
	}
}
}

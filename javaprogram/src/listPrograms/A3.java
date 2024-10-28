package listPrograms;
//ARRAYLIST
import java.util.ArrayList;
import java.util.Collections;
public class A3 {
	public static void main(String[] args) {
		ArrayList a3=new ArrayList();//non-generic
		a3.add(100);
		a3.add(15);
		a3.add(134);
		a3.add(3224);
		a3.add(523);
		a3.add(102);
		System.out.println("unsorted ArrayList");
		System.out.println(a3);
		
		//sorting arraylist in ascending order
		Collections.sort(a3);
		System.out.println("ArrayList in ascending order");
		System.out.println(a3);
		
		//sorting arraylist in decending order
		Collections.sort(a3,Collections.reverseOrder());
		System.out.println("ArrayList in desending order");
		System.out.println(a3);
		
	}
	
	
	

}

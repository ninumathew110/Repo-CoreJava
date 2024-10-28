package stringProgram;
//impconcept 
import java.util.Arrays;
import java.util.Collections;

public class StringSorting {
	public static void main(String[] args) {
		String []fruits= {"kiwi","Mango","Grapes","Apple","Blueberry","Orange"};
		System.out.println("Unsorted Array");
		for(String ele:fruits)
			System.out.println(ele);
		
		Arrays.sort(fruits);//ascending order
		System.out.println("Sorted String Array");
		for(String ele:fruits)
			System.out.println(ele);
		//another way for ascending
		System.out.println("Ascending order"+Arrays.toString(fruits));
		
		Arrays.sort(fruits,Collections.reverseOrder());//decending order
		System.out.println("Sorted String Array in decending order");
		for(String ele:fruits)
			System.out.println(ele);
		//another way for decending
		System.out.println("Decending order"+Arrays.toString(fruits));
	
	
	
	}

}

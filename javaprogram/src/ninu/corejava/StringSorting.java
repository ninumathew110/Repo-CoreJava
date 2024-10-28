package ninu.corejava;


import java.util.Arrays;
import java.util.Collections;

public class StringSorting {

		public static void main(String[] args) {
			String []vehicles= {"BUS","CAR","JEEP","SCOOTER","BYCYCLE","TRUCK"};
			System.out.println("Unsorted Array");
			for(String ele:vehicles)
				System.out.println(ele);
			
			Arrays.sort(vehicles);//ascending order
			System.out.println("Sorted String Array");
			for(String ele:vehicles)
				System.out.println(ele);
			Arrays.sort(vehicles,Collections.reverseOrder());//decending order
			System.out.println("Decending order"+Arrays.toString(vehicles));

			
		
		
		}

	}


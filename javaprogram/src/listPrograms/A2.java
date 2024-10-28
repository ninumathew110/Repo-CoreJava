package listPrograms;
//ARRAYLIST
import java.util.ArrayList;
public class A2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(5);
	a1.add(13);
	a1.add(34);
	a1.add(23);
	a1.add(10);
	System.out.println(a1);
	
	ArrayList a2=new ArrayList();
	a2.add(100);
	a2.add(15);
	a2.add(134);
	a2.add(3224);
	a2.add(523);
	a2.add(1102);
	System.out.println(a2);
	
	//get()
	System.out.println(a2.get(2));
	//set()
	a2.set(0, 50);
	System.out.println(a2);
	a2.remove(1);
	System.out.println(a2);
	//addAll()
	a1.addAll(a2);
	System.out.println(a1);
	System.out.println(a2);
	//containsAll
	System.out.println(a1.containsAll(a2));
	System.out.println(a2.containsAll(a1));
	//removeAll
	a1.removeAll(a2);
	System.out.println(a1);
	
	
	ArrayList<Integer> a3=new ArrayList<>();
	a3.add(100);
	a3.add(15);
	a3.add(134);
	a3.add(3224);
	a3.add(523);
	a3.add(1102);
	
	//create an Integer array
	System.out.println("Elements in array form");
	Integer[] i=new Integer[a3.size()];
	i=a3.toArray(i);
	for(Integer ele:i)
		System.out.println(ele);
	
	
	
	
	
	
	
	
	
	
}
}
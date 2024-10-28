package setPrograms;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
public class A2 {
public static void main(String[] args) {
	HashSet<Integer> h1=new HashSet<>();
	h1.add(103);
	h1.add(520);
	h1.add(230);
	h1.add(940);
	h1.add(56);
	h1.add(71);
	h1.add(30);
	System.out.println(h1);
	
	//for sorting we will convert HashSet
	//into ArrayList
	ArrayList<Integer>a1=new ArrayList<>(h1);
	System.out.println("Elements in ascending order");
	Collections.sort(a1);
	System.out.println(a1);
	
	System.out.println("Elements in descending order");
	Collections.sort(a1,Collections.reverseOrder());
	System.out.println(a1);
	
	//converting HashSet into TreeSet
	TreeSet t1=new TreeSet(h1);
	System.out.println("Elements in ascending order");
	System.out.println(t1);
	
	TreeSet t2=new TreeSet(Collections.reverseOrder());
	t2.addAll(t1);
	System.out.println("Elements in descending order");
	System.out.println(t2);
	}
}
 
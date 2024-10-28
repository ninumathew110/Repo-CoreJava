package listPrograms;
import java.util.Collections;
import java.util.LinkedList;
public class A5 {
public static void main(String[] args) {
	LinkedList<String>l1=new LinkedList<>();
	l1.add("Ravi");
	l1.add("Sunil");
	l1.add("Ajay");
	l1.add("Virat");
	l1.add("Harsh");
	l1.add("Amit");
	l1.add("Sunil");
	l1.add("Harsh");
	l1.add("Virat");
	System.out.println(l1);
	l1.addFirst("Amrita");
	l1.addLast("Shweta");
	System.out.println("First Element="+l1.getFirst());
	System.out.println("Last Element="+l1.getLast());
	System.out.println(l1);
	l1.removeFirst();
	l1.removeLast();
	System.out.println(l1);
	System.out.println(l1.removeFirstOccurrence("Sunil"));
	System.out.println(l1.removeLastOccurrence("Harsh"));
	System.out.println(l1.removeLastOccurrence("Neha"));
	System.out.println(l1);
	
	LinkedList<String>l2=new LinkedList<>();
	l2.add("Monday");
	l2.add("Tuesday");
	l2.add("Wednesday");
	l2.add("Thursday");
	
	LinkedList<String>l3=new LinkedList<>();
	l3.add("Monday");
	l3.add("Tuesday");
	l3.add("Wednesday");
	l3.add("Thursday");
	l3.add("Friday");
	l3.add("Saturday");
	l3.add("Sunday");
	
	l2.retainAll(l3);
	System.out.println(l2);
	
	LinkedList<String>l4=new LinkedList<>();
	l4.add("Ravi");
	l4.add("Sunil");
	l4.add("Ajay");
	l4.add("Virat");
	l4.add("Harsh");
	l4.add("Amit");
	l4.add("Sunil");
	l4.add("Harsh");
	l4.add("Virat");
	System.out.println("Unsorted linkedlist");
	System.out.println(l4);
	
	//sorting linkedlist in ascending order
		Collections.sort(l4);
		System.out.println("LinkedList in asending order");
		System.out.println(l4);
		//sorting linkedlist in descending order
		Collections.sort(l4,Collections.reverseOrder());
		System.out.println("LinkedList in descending order");
		System.out.println(l4);
	

	
	}
}
 
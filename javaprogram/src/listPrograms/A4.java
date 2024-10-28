package listPrograms;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class A4 {
	public static void main(String[] args) {
		LinkedList a1=new LinkedList();//non generic
		System.out.println(a1.isEmpty());//true
		System.out.println(a1.size());//0->length
		a1.add(10);//Integer Object
		a1.add('p');//Character Object
		a1.add(89.90);//Double object
		a1.add(567.456f);//Float Object
	    a1.add(true);//Boolean Object	
	    a1.add("Hello");//String Object
	    System.out.println(a1);
	    System.out.println(a1.isEmpty());//false
		System.out.println(a1.size());//6
		a1.add(2, "Core Java");
		a1.add("Hello");
		System.out.println(a1);
		System.out.println("*************");
		
		LinkedList<Integer>a2=new LinkedList<>();//generic
		System.out.println(a2.isEmpty());//
		System.out.println(a2.size());
		a2.add(10);
		a2.add(5);
		a2.add(13);
		a2.add(34);
		a2.add(23);
		a2.add(10);
		System.out.println(a2);
		
		//contains
		System.out.println(a1.contains("Hello"));
		System.out.println(a2.contains(28));
		
		//indexOf()
		System.out.println(a1.indexOf('p'));
		System.out.println(a2.indexOf(13));
		System.out.println(a2.indexOf(100));
		
		//last indexOf
		System.out.println(a1.lastIndexOf("Hello"));
		System.out.println(a2.lastIndexOf(10));
		
		//accessing the Linkedlist with the for each loop
		System.out.println("the elements in the Linkedlist a1:-");
		for(Object o:a1)
			System.out.println(o);
		
		System.out.println("the elements in the Linkedlist a2:-");
		for(Integer o:a2)
			System.out.println(o);
		
		System.out.println("Elements printing with the help of Iterator");
		Iterator i=a1.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("Elements printing in forward with the help of ListIterator");
		ListIterator l1=a2.listIterator();
		while(l1.hasNext())
			System.out.println(l1.next());
		
		System.out.println("Elements printing in backward with the help of ListIterator");
		while(l1.hasPrevious())
			System.out.println(l1.previous());
		
		a2.clear();
		System.out.println(a2);
		System.out.println(a2.size());
		
        LinkedList a11=new LinkedList();
		a11.add(10);
		a11.add(5);
		a11.add(13);
		a11.add(34);
		a11.add(23);
		a11.add(10);
		System.out.println(a11);
		
		LinkedList a21=new LinkedList();
		a21.add(100);
		a21.add(15);
		a21.add(134);
		a21.add(3224);
		a21.add(523);
		a21.add(1102);
		System.out.println(a21);
		
		//get()
		System.out.println(a21.get(2));
		//set()
		a21.set(0, 50);
		System.out.println(a21);
		a21.remove(1);
		System.out.println(a21);
		//addAll()
		a11.addAll(a2);
		System.out.println(a11);
		System.out.println(a21);
		//containsAll
		System.out.println(a11.containsAll(a21));
		System.out.println(a21.containsAll(a11));
		//removeAll
		a11.removeAll(a21);
		System.out.println(a11);
		
		
		LinkedList<Integer> a3=new LinkedList<>();
		a3.add(100);
		a3.add(15);
		a3.add(134);
		a3.add(3224);
		a3.add(523);
		a3.add(1102);
		
		//create an Integer array
		System.out.println("Elements in array form");
		Integer[] i1=new Integer[a3.size()];
		i1=a3.toArray(i1);
		for(Integer ele:i1)
			System.out.println(ele);
		
	    LinkedList a33=new LinkedList();
		a33.add(100);
		a33.add(15);
		a33.add(134);
		a33.add(34);
		a33.add(523);
		a33.add(102);
		System.out.println("unsorted LinkedList");
		System.out.println(a33);
		
		//sorting linkedlist in ascending order
		Collections.sort(a33);
		System.out.println("LinkedList in asending order");
		System.out.println(a33);
		//sorting linkedlist in descending order
		Collections.sort(a33,Collections.reverseOrder());
		System.out.println("LinkedList in descending order");
		System.out.println(a33);
		
		
	}

}
 
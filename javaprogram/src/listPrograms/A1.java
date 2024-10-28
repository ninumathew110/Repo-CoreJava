package listPrograms;
//ARRAYLIST
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class A1 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();//non generic
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
	
	ArrayList<Integer>a2=new ArrayList<>();//generic
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
	
	//accessing the arraylist with the for each loop
	System.out.println("the elements in the Arraylist a1:-");
	for(Object o:a1)
		System.out.println(o);
	
	System.out.println("the elements in the Arraylist a2:-");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
	
}
}
 
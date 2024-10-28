package setPrograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
public class A1 {
public static void main(String[] args) {
	HashSet h1=new HashSet();//non generic
	System.out.println(h1.isEmpty());
	System.out.println(h1.size());
	h1.add(10);//Integer Object
	h1.add('p');//Character Object
	h1.add(89.90);//Double object
	h1.add(567.456f);//Float Object
    h1.add(true);//Boolean Object	
    h1.add("Hello");//String object
    h1.add('p');///duplicate
    System.out.println(h1);
    
    HashSet<Integer>a2=new HashSet<>();//generic
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
	System.out.println(h1.contains("Hello"));
	System.out.println(a2.contains(28));
	
	//accessing the hashset with the for each loop
	System.out.println("the elements in the HashSet h1:-");
	for(Object o:h1)
		System.out.println(o);
	
	System.out.println("the elements in the HashSet a2:-");
	for(Integer o:a2)
		System.out.println(o);
	
	System.out.println("Elements printing with the help of Iterator");
	Iterator i=h1.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	
	a2.clear();
	System.out.println(a2);
	System.out.println(a2.size());
	
	
	HashSet h3=new HashSet();
	h3.add(10);
	h3.add(5);
	h3.add(13);
	h3.add(34);
	h3.add(23);
	h3.add(10);
	System.out.println(h3);
	
	HashSet h4=new HashSet();
	h4.add(100);
	h4.add(15);
	h4.add(134);
	h4.add(3224);
	h4.add(523);
	h4.add(1102);
	System.out.println(h4);
	
	
	h4.remove(100);
	System.out.println(a2);
	//addAll()
	h3.addAll(h4);
	System.out.println(h3);
	System.out.println(h4);
	//containsAll
	System.out.println(h3.containsAll(h4));
	System.out.println(h4.containsAll(h3));
	//removeAll
	h3.removeAll(h4);
	System.out.println(h3);
	
	
	HashSet<Integer> h5=new HashSet<>();
	h5.add(100);
	h5.add(15);
	h5.add(134);
	h5.add(3224);
	h5.add(523);
	h5.add(1102);
	
	//create an Integer array
	System.out.println("Elements in array form");
	Integer[] i1=new Integer[h5.size()];
	i1=h5.toArray(i1);
	for(Integer ele:i1)
		System.out.println(ele);
	
	
	
	
	
		
    
}
}
 

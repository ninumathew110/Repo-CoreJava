package mapPrograms;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class A3 {
	public static void main(String[] args) {
		LinkedHashMap h1=new LinkedHashMap();//non generic
		h1.put(1, "Hello");
		h1.put(false, 45.21);
		h1.put('f', 'g');
		h1.put('f', 24);
		System.out.println(h1.isEmpty());
		System.out.println(h1.size());
		System.out.println(h1);
		
		LinkedHashMap<Integer,String> h2=new LinkedHashMap<>();// generic
		h2.put(1, "Hello");
		h2.put(7,"Good");
		h2.put(null,"Hi");
		h2.put(4, "Morning");
		h2.put(3, "Students");
		h2.put(9, "Core java");
		System.out.println(h2.isEmpty());
		System.out.println(h2.size());
		System.out.println(h2);
		
		LinkedHashMap<Integer,String> h3=new LinkedHashMap<>();// generic
		h3.put(13, "Hi");
		h3.put(27,"Go");
		h3.put(14, "Money");
		h3.put(33, "Stand");
		h3.put(19, "Advance java");
		System.out.println(h3.isEmpty());
		System.out.println(h3.size());
		System.out.println(h3);
		
		h2.putAll(h3);
		System.out.println(h2);
		
		System.out.println(h2.equals(h3));
		System.out.println(h2.containsKey(3));
		System.out.println(h3.containsKey("Bye"));
		System.out.println(h3.get(19));
		System.out.println(h2.remove(9));
		System.out.println(h2);
		
		
		//view keys of the LinkedHashMap-->keySet()
		//returntype-->Set
		System.out.println("Keys of h2");
		Set s=h2.keySet();
		for(Object ele:s)
			System.out.println(ele);
		
		//view value of the Linkedhashmap
		//return type-->Collection
		System.out.println("Values of h2");
		Collection c=h2.values();
		for(Object ele:c)
			System.out.println(ele);
		
		//view key,value pair of the Linkedhashmap->entrySet()
		//Map.Entry<K,V> type->getKey(), getValue()
		System.out.println("The key-value are:-");
		for(Map.Entry<Integer,String> ele:h2.entrySet())
		{
			//System.out.println(ele);
			System.out.println("Key="+ele.getKey()+" "+"Values="+ele.getValue());
		}
		
		h2.clear();System.out.println(h2);
		System.out.println(h2.size());
		
		
		//converting the hashMap in TreeMap to print elements in ascending order
		TreeMap<Integer,String> t1=new TreeMap<>(h3);
		System.out.println(t1);
		
		//elements of LinkedHashmap printing in descending order
		
		TreeMap<Integer,String> t2=new TreeMap<>(Collections.reverseOrder());
		t2.putAll(t1);
		System.out.println(t2);
		}
	}
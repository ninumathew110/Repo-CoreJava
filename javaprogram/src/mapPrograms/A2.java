package mapPrograms;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
public class A2 {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> h2=new TreeMap<>();// generic
		h2.put(1, "Hello");
		h2.put(7,"Good");
		h2.put(4, "Morning");
		h2.put(3, "Students");
		h2.put(9, "Core java");
		System.out.println(h2.isEmpty());
		System.out.println(h2.size());
		System.out.println(h2);
		
		TreeMap<Integer,String> h3=new TreeMap<>();// generic
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
		System.out.println(h3.containsValue("Bye"));
		System.out.println(h3.get(19));
		System.out.println(h2.remove(9));
		System.out.println(h2);
		
		
		//view keys of the TreeMap-->keySet()
		//returntype-->Set
		System.out.println("Keys of h2");
		Set s=h2.keySet();
		for(Object ele:s)
			System.out.println(ele);
		
		//view value of the Treemap
		//return type-->Collection
		System.out.println("Values of h2");
		Collection c=h2.values();
		for(Object ele:c)
			System.out.println(ele);
		
		//view key,value pair of the Tree map->entrySet()
		//Map.Entry<K,V> type->getKey(), getValue()
		System.out.println("The key-value are:-");
		for(Map.Entry<Integer,String> ele:h2.entrySet())
		{
			//System.out.println(ele);
			System.out.println("Key="+ele.getKey()+" "+"Values="+ele.getValue());
		}
		
		h2.clear();System.out.println(h2);
		System.out.println(h2.size());
		
	
	//printing in descending order
	TreeMap<Integer,String> h4=new TreeMap<>(Collections.reverseOrder());// generic
	h4.put(13, "Hi");
	h4.put(27,"Go");
	h4.put(14, "Money");
	h4.put(33, "Stand");
	h4.put(19, "Advance java");
	System.out.println(h4);
	}

}
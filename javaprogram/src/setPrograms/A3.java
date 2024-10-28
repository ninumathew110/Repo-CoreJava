package setPrograms;
import java.util.Collections;
import java.util.TreeSet;
public class A3 {
public static void main(String[] args) {
	TreeSet t1=new TreeSet();
	t1.add(90);
	t1.add(45);
	t1.add(67);
	t1.add(38);
	t1.add(100);
	t1.add(61);
	System.out.println(t1);//ascending
	
	TreeSet t2=new TreeSet(Collections.reverseOrder());
	t2.add(90);
	t2.add(45);
	t2.add(67);
	t2.add(38);
	t2.add(100);
	t2.add(61);
	System.out.println(t2);//descending
	
	
	
}
}
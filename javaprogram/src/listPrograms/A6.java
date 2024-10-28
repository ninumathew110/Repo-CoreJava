package listPrograms;
import java.util.Vector;
public class A6 {
public static void main(String[] args) {
	Vector v1=new Vector();//non geneic
	System.out.println(v1.capacity());
	v1.addElement("hello");
	v1.addElement(true);
	v1.addElement(78);
	v1.addElement(67.12f);
	v1.addElement('y');
	v1.addElement(68.123);
	System.out.println(v1.isEmpty());
	System.out.println(v1.size());
	System.out.println(v1);
	v1.addFirst(56787l);
	v1.addLast(998766l);
	System.out.println(v1.firstElement());
	System.out.println(v1.lastElement());
	System.out.println(v1.elementAt(4));
	v1.removeElementAt(4);
	System.out.println(v1);
	v1.removeAllElements();
	System.out.println(v1);
	System.out.println(v1.size());
}
}
 
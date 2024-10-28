package listPrograms;
import java.util.Stack;
public class A7 {
public static void main(String[] args) {
	Stack s1=new Stack();//non generic
	s1.push("hello");
	s1.push(true);
	s1.push(78);
	s1.push(67.12f);
	s1.push('y');//top
	s1.push(68.123);//top
	System.out.println(s1.peek());
	System.out.println(s1.pop());
	System.out.println(s1.peek());
	
	Stack<Character> s2=new Stack<>();// generic
	s2.push('l');
	s2.push('i');
	s2.push('p');
	s2.push('f');
	s2.push('y');
	s2.push('m');//top
	//pop elements from stack 
	System.out.println("The elements deleted are:-");
	while(!s2.isEmpty())//!false=true
		System.out.println(s2.pop());
	
	
	
	
}
}
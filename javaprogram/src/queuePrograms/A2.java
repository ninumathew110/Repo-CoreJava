package queuePrograms;
import java.util.Collections;
import java.util.PriorityQueue;
public class A2 {
public static void main(String[] args) {
	PriorityQueue p1=new PriorityQueue();
	p1.offer(23);
	p1.offer(8);
	p1.offer(89);
	p1.offer(34);
	p1.offer(23);
	p1.offer(19);
	//p1.offer('m);//exeception
	System.out.println(p1);
	System.out.println(p1.isEmpty());
	System.out.println(p1.size());
	System.out.println(p1.contains(19));
	
	//to remove elements from the PriorityQueue
	System.out.println("Deleting elements is ascending order");
	while(!p1.isEmpty())//!false=true
	{
		System.out.println(p1.poll());
	}
	
	PriorityQueue p2=new PriorityQueue(Collections.reverseOrder());//reverse the order is desending order
	p2.offer(23);
	p2.offer(8);
	p2.offer(89);
	p2.offer(34);
	p2.offer(23);
	p2.offer(19);
	//to remove elements from the PriorityQueue
		System.out.println("Deleting elements is decending order");
		while(!p2.isEmpty())//!false=true
		{
			System.out.println(p2.poll());
		}
}
}

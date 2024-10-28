package arrayPrograms;

//REVERSING AN ARRAY->PALIDROME

public class A11 {
public static void main(String[] args) {
	int []n= {22,11,56,84,90};
	System.out.println("Original array");
	for(int ele:n)
		System.out.print(ele+" ");
	
	System.out.println();
	System.out.println("Reversed array:-");
	for(int i=n.length-1;i>=0;i--)
		System.out.print(n[i]+" ");
		
}
}
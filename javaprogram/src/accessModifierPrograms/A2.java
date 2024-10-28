package accessModifierPrograms;

public class A2 {
	public static void main(String[] args) {
		A1 obj=new A1();//its "A1" is a non-static  it cant be called directly,use obj
		System.out.println(obj.a);
		obj.hello();
		obj.m1();
	}

}

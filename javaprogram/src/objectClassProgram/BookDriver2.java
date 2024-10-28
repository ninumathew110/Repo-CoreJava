package objectClassProgram;

public class BookDriver2 {
		public static void main(String[] args) {
		Book b1=new Book("parichay",1200.0);
		//Book b3=b1;//
		Book b2=new Book("parichay",1200.0);
		
		//System.out.println(b1.title);
		//System.out.println(b1.price);
		//System.out.println(b2.title);
		//System.out.println(b2.price);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1==b2);//verify the reference of object
		System.out.println(b1.equals(b2));//verify the reference of object(another way for line 12)
		//then after line 16, it will verify the state
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.hashCode()==b2.hashCode());
		}

}

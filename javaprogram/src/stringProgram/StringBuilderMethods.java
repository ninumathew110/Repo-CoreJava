package stringProgram;

public class StringBuilderMethods {
		public static void main(String[] args) {
			StringBuilder s1=new StringBuilder("Today is Wednesday");
			System.out.println("Length="+s1.length());
			System.out.println("Capacity="+s1.capacity());
			System.out.println(s1);
			//append->to append together
			s1.append(true);
			s1.append(' ');
			s1.append("We are in core java class");
			char []ch= {'c','l','a','s','s','.'};
			s1.append(ch);
			System.out.println(s1);
			StringBuilder s2=new StringBuilder("This is May month.");
			s1.append(s2);
			System.out.println(s1);
					
			//insert method
			StringBuilder s3=new StringBuilder("Hello how are you");
			System.out.println(s3);
			s3.insert(5, '!');
			System.out.println(s3);
			s3.insert(18, '.');
			System.out.println(s3);
			char[] ch1= {' ','s','w','a','t','i'};
			s3.insert(18, ch1);
			System.out.println(s3);
			
			//reverse()
			StringBuilder s4= new StringBuilder("Wednesday");
			System.out.println(s4);
			s4.reverse();
			System.out.println(s4);
			System.out.println(s2);
			s2.reverse();
			System.out.println(s2);
			
			//Replace
			StringBuilder s5=new StringBuilder("Core Java");
			System.out.println(s5);
			s5.replace(0, 4, "Advance");
			System.out.println(s5);
			
			//delete() and deleteCharAt()
			System.out.println(s4);
			s4.delete(0, 3);
			System.out.println(s4);//sendeW
			s4.deleteCharAt(2);
			System.out.println(s4);
			
			//converting stringBuilder into string type
			StringBuilder s6=new StringBuilder("This is morning core java session.");
			System.out.println(s6);
			s6.reverse();
			System.out.println(s6);
			String str1=new String(s6);
			//str1.reverse();//The method reverse() is undefined for the type String
		
		}

	}




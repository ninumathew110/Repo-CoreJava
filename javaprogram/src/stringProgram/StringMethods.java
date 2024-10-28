package stringProgram;

public class StringMethods {
	public static void main(String[] args) {
//different ways of creating the string
System.out.println("Good Morning");
String s=null;
String ss=" a ";
String sss=" ";

//creating different objects
String s1="Good Morning Everyone!!";//1st obj created in SCP
String s2=new String("Today is tuesday");//2 objects will be created in heap & SCP.
System.out.println(s1);//s1->non primitive,but string extends obj class,toString is overriden,instead of reference
System.out.println("Length="+s1.length());
System.out.println(s2);	
System.out.println("Length="+s2.length());
System.out.println(s1.length()==s2.length());
System.out.println(s1==s2);//equally operator is always used to compare the address
System.out.println(s1.equals(s2));//compares the states of s1 &s2
System.out.println(s1.hashCode()==s2.hashCode());//compare the unique integer no on the basis of states.

String s3="good morning everyone!!";
System.out.println(s1.equals(s3));//gives false,eventhough the value is same,bz of case difference
System.out.println(s1.equalsIgnoreCase(s3));//Gives True,by giving equals igonore case

String s4="   How are you?	";
String s5="Hello How are you? Hello How is your family?";

System.out.println(s4);	
System.out.println(s4.trim());//to trim the space in start and end.

//to write substring
System.out.println(s2.substring(9));//from 9th position to end it will display

//to print in-between data
System.out.println(s2.substring(6, 8));//8->substring end index-1 and take the position no.

//to find index of values
System.out.println(s2.indexOf('a'));
System.out.println(s2.indexOf('a', 10));
System.out.println(s1.indexOf("Morning", 3));

//to find last sentence,index
System.out.println(s1.lastIndexOf('o'));
System.out.println(s5.lastIndexOf("How"));

//starting from
System.out.println(s5.startsWith("He"));
System.out.println(s5.startsWith("are", 10));

//ending with
System.out.println(s5.endsWith("?"));

//for searching
System.out.println(s5.contains("you"));//select charSequence in keyboard option

//empty method
String s6="";//length=0
String s7=" ";//length=1
System.out.println(s6.isEmpty());
System.out.println(s7.isEmpty());
//blank space
System.out.println(s6.isBlank());
System.out.println(s7.isBlank());//even though space is there,no value return,so true
//concatination
String s8="Good Morning all the students.";
String s9="We are conducting Core java session.";
String s10=s8.concat(s9);
System.out.println(s8.concat(s9));
System.out.println(s8.concat("We are conducting Core java session."));

//replace method(important for interview)
String s11="Java Programming";
String s12=s11.replace('a', 'e');
System.out.println(s12);
String s13="Hello,Today We Have Core Java Classes";
System.out.println(s13);
String s14 =s13.replaceAll("[A-Z]", "*");
System.out.println(s14);
String s15=s13.replaceAll("[aeiouAEIOU]", "#");
System.out.println(s15);
//convert number->empty,using replace method
String s16="Hello123 How are you day 14/05/2024";
System.out.println(s16);
String s17=s16.replaceAll("[0-9 /]", "");
System.out.println(s17);

//split method(important for interview) it will split into array
String s18="I am a java developer";
System.out.println(s18);
String [] s19=s18.split(" ");
for(String ele:s19)
	System.out.println(ele);
String s20="corejava";
System.out.println(s20);
String [] s21=s20.split("");
for(String ele1:s21)
	System.out.println(ele1);
String s22="I! am! a! java! developer!";
System.out.println(s22);
String [] s23=s22.split("!");
for(String ele:s23)
	System.out.println(ele);
String str="apple,banana,orange,mango,grapes";
System.out.println(str);
String [] str1=str.split(",");
for(String ele:str1)
	System.out.println(ele);

//to change string into char array
char [] c1=s20.toCharArray();
for(char ele:c1)
	System.out.println(ele);
char [] c2=s18.toCharArray();
for(char ele:c2)
	System.out.println(ele);

//method comparable
String s24="Java";//J=74
String s25="java";//j=106
System.out.println(s24.compareTo(s25));//74-106=-32
System.out.println(s25.compareTo(s24));//106-74=32
String s26="corejava";//c=99
String s27="corejava";//c=99
System.out.println(s26.compareTo(s27));
	}
}

package fileHandlingPrograms;
//to write into the file
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class A2 {
public static void main(String[] args) {
	String data=" This is core java class."
				+ "\n We are discussing file handling concept."
				+"\n Today is Thurday."
				+"\n Tommorrow we are going to learn multithreading.";
	try {
FileWriter obj=new FileWriter("E:/JFFCJD-M52/ABC.txt");
obj.write(data);
obj.close();
System.out.println("Data written to successfully ");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
}

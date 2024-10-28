package fileHandlingPrograms;
//to delete the file
import java.io.File;
public class A5 {
	public static void main(String[] args) {
	File obj=new File("E:/JFFCJD-M52/ABC.txt");
	if(obj.delete())
		System.out.println("File "+obj.getName()+" deleted");
	else
		System.out.println("File not deleted");
}
}
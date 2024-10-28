package fileHandlingPrograms;
//file methods
import java.io.File;
public class A4 {
	public static void main(String[] args) {
		File obj=new File("E:/JFFCJD-M52/ABC.txt");
		if(obj.exists())//to check whether file exist or not
		{
			System.out.println(obj.getAbsolutePath());
			System.out.println(obj.getFreeSpace());
			System.out.println(obj.getName());
			System.out.println(obj.getParent());
			System.out.println(obj.getPath());
			System.out.println(obj.getTotalSpace());
			System.out.println(obj.canExecute());
			System.out.println(obj.canRead());
			System.out.println(obj.length());
			System.out.println(obj.isAbsolute());
			System.out.println(obj.isDirectory());
			System.out.println(obj.isFile());
			System.out.println(obj.isHidden());
		}
	
	
	}

}

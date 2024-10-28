package fileHandlingPrograms;
//create a new file
import java.io.File;
import java.io.IOException;
public class A1 {
	public static void main(String[] args) {
		File obj=new File("E:/JFFCJD-M52/ABC.txt");
		try
		{
			
		if (obj.createNewFile())
		{
			System.out.println("File created "+obj.getName());
		}
		else
		{
			System.out.println("File already exist");
		}
	}
	catch(IOException e)
	{
		System.out.println("IOException handled");
	}

}
}
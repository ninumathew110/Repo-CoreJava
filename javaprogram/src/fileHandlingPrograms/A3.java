package fileHandlingPrograms;
//read the data
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A3 {
	public static void main(String[] args) {
		File obj=new File("E:/JFFCJD-M52/ABC.txt");
		try
		{
		Scanner sc=new Scanner(obj);
		while(sc.hasNextLine())
		{
			String data=sc.nextLine();
			System.out.println(data);
		}
		sc.close();
		}
		catch(FileNotFoundException e)	
		{
			e.printStackTrace();
		}
	}

}

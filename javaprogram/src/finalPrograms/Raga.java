package finalPrograms;

public class Raga extends Watch{
	void change()//cannot override the final method from watch
	{
		System.out.println("change() from Raga");
	}

}
 
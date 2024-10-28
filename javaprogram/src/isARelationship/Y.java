package isARelationship;

public class Y extends X {//child class
int j;
//inherited->i,m1(),e
static int f=34;
static void m2()
{
	System.out.println("static() from X class");
}
void display()
{
	System.out.println(i);
	//System.out.println(a);//since its private
}
}

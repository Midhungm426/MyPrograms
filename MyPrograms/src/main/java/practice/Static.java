package practice;

public class Static 
{
	public static void show()
	{
		System.out.println("Hi");
	}
	public static void main (String args[])
	{
		Static.show();
		show();
	}
}

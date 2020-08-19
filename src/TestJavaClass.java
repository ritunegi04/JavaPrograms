//final variable test
public class TestJavaClass {
	final int b=20;
	public void initialiseb()
	{
		int b=30;
		System.out.print(b);
		
	}
	
public static void main(String[] arg)
{
	TestJavaClass tj=new TestJavaClass();
	System.out.println(tj.b);
	tj.initialiseb();
}
}

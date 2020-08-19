
abstract class TestAbstract {
static int x=1;
	TestAbstract()
	{
		System.out.println("hello");
	}
	
	void print()
	{
		System.out.println(x);
	}
	public abstract void printname();
	
	static void printhello()
	{
		System.out.println("static method from abstract class");
		
	}
	
}

public class Child extends TestAbstract
{

	@Override
	public void printname() {
		// TODO Auto-generated method stub
		System.out.println("child class");
		
	}
	
	public static void main(String[] arg)
	{
		Child t=new Child();
		t.printname();
		TestAbstract.printhello();
		t.print();
	}
	
}
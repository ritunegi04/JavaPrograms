
 interface A {
	
	default void print()
	{
		System.out.println("A");
	}
}

interface B

{
	default void print()
	{
		System.out.println("B");
	}
}

class InterfaceTest implements A,B
{
	InterfaceTest i=new InterfaceTest();
	i.print();
}


public class CheckObjectEquivalence {
	
	int i,j;
	
	public CheckObjectEquivalence()
	{
		i=10;
		j=20;
	}
	
	public static void main(String[] arg)
	{
		CheckObjectEquivalence c= new CheckObjectEquivalence();
		CheckObjectEquivalence c1=new CheckObjectEquivalence();
		//c1=c;
		CheckObjectEquivalence c2=c1;
		System.out.println(c.equals(c1));
		System.out.println(c.equals(c2));
		System.out.println(c1.equals(c2));
		System.out.println(c1.i);
	}
}


public class StringRotationCheck {

	public static void main(String[] arg)
	{
		String a="Ritu";
		String b="itRu";
		if((a+a).indexOf(b)!=-1)
		{
			System.out.println("b is rotation of a");
		}
	}
}

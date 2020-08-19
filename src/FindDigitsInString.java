
public class FindDigitsInString {
	public static void main(String[] arg)
	{
		String a="Ri2tu3";
		char[] c1=a.toCharArray();
		for(Character c:c1)
		{
			if(Character.isDigit(c))
			{
				System.out.println("Digit found : "+ c);
			}
		}
	}

}

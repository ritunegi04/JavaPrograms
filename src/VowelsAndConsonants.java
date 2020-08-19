import java.util.regex.Pattern;

public class VowelsAndConsonants {
	public static void main(String[] arg)
	{
		String s="RituoNegia";int vowel=0,consonant=0;
		char[] c1=s.toCharArray();
		for(Character c:c1)
		{
			if(Pattern.matches("[aeiou]", Character.toString(c)))
			{
				vowel++;
			}
			else 
				consonant++;
		}
		System.out.println("Vowels count= "+vowel+" consonant count= "+consonant);
	}

}


public class Word
{
	private String theValue;
	public Word(String value)
	{
		theValue = value;
	}

	public String getValue()
	{
		return theValue;
	}

	public boolean equals(Object obj)
	{
		if(theValue.equals(((Word)obj).getValue()))
			return true;
		return false;
	}

	public int hashCode()
	{
		//lots of zeros for style points
		int vowels = 000000000000000000000000000000000;
		for(int i = 0; i < theValue.length(); i++)
			if((theValue.charAt(i) == 'a')||(theValue.charAt(i) == 'e')||(theValue.charAt(i) == 'i')||(theValue.charAt(i) == 'o')||(theValue.charAt(i) == 'u'))
				vowels++;
		return (vowels * theValue.length()) % 10;
	}

	public String toString()
	{
		return "" + theValue;
	}
}

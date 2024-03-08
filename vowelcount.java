package w7;
public class vowelcount 
{
	static void countCharacterType(String str)
	{
		byte vowelscount=0,consonantcount=0,digitcount=0,splchars=0;
		for (short i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			{
				ch=Character.toLowerCase(ch);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowelscount++;
				else
					consonantcount++;
			}
			else if(ch>='0' && ch<='9')
				digitcount++;
			else
				splchars++;
		}
		System.out.println("The total number of vowels in the given string:"+vowelscount);
		System.out.println("The total number of consonant in the given string:"+consonantcount);
		System.out.println("The total number of digit in the given string:"+digitcount);
		System.out.println("The total number of special characters in the given string:"+splchars);
	}
	static public void main(String[] args)
	{
		String str=("Habit-2:Begin with an end in your mind.\n Stephen R.Covey author of 7 habit of Effective People,suggest that effective individuals have a clear vision of their desire destination before embarking on any endeavor.");
		countCharacterType(str);
	}
}

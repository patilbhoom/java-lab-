package w7;
import java.util.Scanner;
public class checkPalindrome 
{
	public static void main(String args[])
	{
		String str_original="",reverseStr="";
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter any valid string");
		str_original= inScanner.next();
		inScanner.close();
		int str_length=str_original.length();
		System.out.println("length is.."+str_length);
		for(int i=(str_length-1);i>=0;--i)
		{
			reverseStr=reverseStr+str_original.charAt(i);
		}
		if(str_original.equalsIgnoreCase(reverseStr))
		{
			System.out.println("The given string \""+str_original+"\" is a palindrome");
		}
		else
		{
			System.out.println("The given string \""+str_original+"\" is  not a palindrome");
		}
	}

}

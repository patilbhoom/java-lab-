package w3;
import java.util.Scanner;
public class calculateAverage 
{
	public static void main(String args[])
	{
		float average=0.0f;
		Scanner sc=new Scanner(System.in);
		Integer cie1,cie2,cie3;
		System.out.println("Enter the score of first internal");
		cie1=Integer.parseInt(sc.next());
		System.out.println("Enter the score of second internal");
		cie2=Integer.parseInt(sc.next());
		System.out.println("Enter the score of third internal");
		cie3=Integer.parseInt(sc.next());
		average=(float)(cie1+cie2+cie3)/3;
		System.out.println("The average of internalscore is"+average);
		sc.close();
	}
}

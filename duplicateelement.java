package w7;
import java.util.Scanner;
public class duplicateelement 
{
	public static void main(String args[])
	{
		int array[]= new int[10];
		boolean isDuplicate=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size= sc.nextInt();
		System.out.println("Enter array elements one by one");
		for (int i=0; i<size; i++)
			array[i]=sc.nextInt();
		System.out.println();
		sc.close();
		int i;
		outer:for (int i1=0;i1<size;i1++)
        {
			for(int j=i1+1;j<size;j++)
			{
				if (array[i1]==array[j])
				{
					isDuplicate=true;break outer;
				}
			}
        }
if(isDuplicate=true)
{
	System.out.println("Duplicate elements found in array");
}
else
{
	System.out.println("Duplicate elements not found in array");
}
}
}
package actprgm;
import java.util.Scanner;
public class Chararr 
{
public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the size of the character array: ");
	int size = scanner.nextInt();
	char[] charArray = new char[size];
	System.out.println("Enter " + size + " characters:");
	for (int i = 0; i < size; i++)
	{
		charArray[i] = scanner.next().charAt(0);
		}
	System.out.println("Characters in descending order:");
	displayDescendingOrder(charArray);
	scanner.close();
}
public static void displayDescendingOrder(char[] arr) 
{
	sortDescending(arr);
	for (char ch : arr)
	{
		System.out.print(ch + " ");
		}
	System.out.println();
}
public static void sortDescending(char[] arr) 
{
	for (int i = 0; i < arr.length - 1; i++)
	{
		for (int j = i + 1; j < arr.length; j++) 
		{
			if (arr[i] < arr[j])
			{
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
	}
}
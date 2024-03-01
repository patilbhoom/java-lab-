package w5;
import java.util.Scanner;
public class Sum_of_Negativeno 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        
        for (int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        
        int sum = 0;
        for(int i=0;i<n;i++) 
        {
            if (arr[i] < 0) 
            {
                sum+=arr[i];
            }
        }
        
        System.out.println("The sum of negative numbers ="+sum);
        sc.close();
    }
}
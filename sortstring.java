package w7;
import java.util.Scanner;
public class sortstring
{
  public static void  main (String args[])
  {
    String list[]=new String[6];
    Scanner inScanner = new Scanner(System.in);
    System.out.println("enter list of name one by one");
    for(int i=0;i<6;i++)
            list[i]=inScanner.next();
    for (int i=0; i<6; i++)
    {
           for(int j=1;j<6;j++)
               if(list[j-1].compareTo(list[i])>0)
               {
                 String str=list[j];
                 list[j]=list[j-1];
                 list[j-1]=str;
               }
    }
    for (int i=0;i<6;i++)
         System.out.println(list[i]);
    inScanner.close();
  }
}


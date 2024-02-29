package w4;
import java.util.Scanner;
public class demofinalize
{
	public static void main(String[] args) 
	{ 
		student1 harsha=new student1();
        harsha.display();
        System.out.println("Object reference is... "+harsha);
        harsha.finalize();
        System.gc();
        System.out.println("Object garbage collected ");
        }
}
class student1
{ 
	String name; 
    int rno; 
    float res; 
    Scanner sc =new Scanner(System.in);
    student1()
    { 
    	System.out.println("Enter the Roll Number of Student.");
        rno=Integer.parseInt(sc.next());
        System.out.println("Enter the Name of Student.");
        name=sc.next();
        System.out.println("Enter the result of the Student.");
        res=Float.parseFloat(sc.next());
        }
    void display()
    { 
    	System.out.println(rno+"\t\t"+name+"\t\t"+res);
    	}
    protected void finalize()
    {
    	sc.close();
        System.out.println("Object cleaned up by finalize method");
        }
}
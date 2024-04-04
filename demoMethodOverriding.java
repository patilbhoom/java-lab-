package w9;
import java.util.Scanner;
class Student
{
	String name;
    float[] cie={0,0,0};
    float avg;
    byte rollno;
    void setStudent(String n,float ia[],byte rno)
    {
    	name=n;
        avg=0.0f;
        rollno=rno;
        for(byte i=0;i<3;i++)
        	cie[i]=ia[i];
        this.calculateaverage();
        }
    void calculateaverage()
    {
    	float sum=0.0f;
    	for(byte i=0;i<3;i++)
    		sum=sum+cie[i];
            avg=sum/3.0f;
            }
    void showStudent()
    {
    	System.out.println(rollno+"\t\t"+name+"\t\t"+avg+"\t");
    	}
}
class Grade extends Student
{
	final byte grace=10;float attendance;
	Scanner inScanner=new Scanner(System.in);
	void setStudent(String n,float ia[],byte rollno)
	{
		System.out.println("Enter the attendance of student....");
		attendance=inScanner.nextFloat();
		if(attendance>=75.0f)
		{
			ia[2]=grace;
			super.setStudent(n,ia,rollno);
			}
		else
			super.setStudent(n,ia,rollno);
		}
}
public class demoMethodOverriding
{
	public static void main(String args[])
	{
		Grade Sanvi=new Grade();
		float[] cie={20.4f,15,9f,30.0f};
        Sanvi.setStudent("Sanvi A",cie,(byte)20);
        System.out.println("The internal detals of stuednt.");
        System.out.println("rollno\t\tName\t\tAverage");
        Sanvi.showStudent();
        }
}
package w7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Student
{
	String name,course;
	int rno;
	float ia1,ia2,ia3,avg;
	Student()
	{
		try
		{
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br =new BufferedReader(isr);
			System.out.println("Enter roll no of student");
			rno=Integer.parseInt(br.readLine());
			System.out.println("Enter name of student");
			name=br.readLine();
			System.out.println("Enter course of student");
			course=br.readLine();
			System.out.println("Enter first cie score of student");
			ia1=Float.parseFloat(br.readLine());
			System.out.println("Enter second cie score of student");
			ia2=Float.parseFloat(br.readLine());
			System.out.println("Enter third cie score of student");
			ia3=Float.parseFloat(br.readLine());
			avg=(ia1+ia2+ia3)/3;
		}
		catch(Exception e)
		{
			System.out.println("Run Time rror occured while reading input..");e.printStackTrace();
		}
	}
	void displayStudentDetails()
	{
		System.out.println(rno+"\t"+name+"\t\t"+course+"\t"+ia1+"\t"+ia2+"\t"+ia3+"\t"+avg);
	}
}
public class arrayofstudents 
{
	public static void  main (String args[])
	{
		Student list[]=new Student[5];
		for(int i=0;i<list.length;i++)
			list[i]=new Student();
		System.out.println("\n*******************************************");
		System.out.println("R.no\tName\t\tCourse\tCie1\tCie2\tCie3\tAvg");
		System.out.println("\n*******************************************");
		for(int i=0;i<3;i++)
			list[i].displayStudentDetails();
		System.out.println("\n*******************************************");
	}
}
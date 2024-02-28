package w2;
class Student
{
	String StudName,dept;
	int RollNo;
	static String clg="PES";
	int percentage;
	
	void setStudent(String name,int rollno,String cdept,int per)
	{
		StudName=name;
		RollNo=rollno;
		dept=cdept;
		percentage=per;
	}
	void getStudent()
	{
		System.out.println(StudName+"\t"+RollNo+"\t"+clg+"\t"+dept+"\t\t"+percentage);
	}
}
public class Stud 
{
	public static void main(String args[])
	{
		System.out.println("Name\tRollNo\tclg\tdept\tpercentage");
		Student Stud1=new Student();
		Student Stud2=new Student();
		Stud1.setStudent("Lashya",345,"CS",60);
		Stud2.setStudent("Nayans",123,"EC",90);
		Stud1.getStudent();
		Stud2.getStudent();
	}
}
package w9;
class Student
{
	String name;
    float[] cie={0,0,0};
    float avg;
    byte rollno;
    void setStudent(String n,float ia[],byte rno)
    {
    	float sum=0.0f;
    	name=n;
        avg=0.0f;
        rollno=rno;
        for(byte i=0;i<3;i++)
        {
        	cie[i]=ia[i];
        	sum=sum+cie[i];
        }
       avg=sum/3.0f; 	
}
    void setStudent(String n,float ia1,float ia2,byte rno)
    {
    	name=n;
    	rollno=rno;
    	cie[0]=ia1;
    	cie[1]=ia2;
    	avg=(cie[0]+cie[1])/3.0f;
    }
    void setStudent(String n,float ia,byte rno)
    {
    	name=n;
    	rollno=rno;
    	cie[0]=ia;
    	avg=(cie[0])/3.0f;
    }
    void showStudent()
    {
    	System.out.println(rollno+"\t\t"+name+"\t\t"+avg+"\t\t");
    	}
}
public class demoMethodOverloading 
{
	public static void main(String args[])
	{
		Student Lashya=new Student();
		System.out.println("The internal detals of stuednt.");
        System.out.println("rollno\t\tName\t\tAverage");
        Lashya.setStudent("Lashya Honur", 19.4f,(byte)15);
        Lashya.showStudent();
        Lashya.setStudent("Shashi Kumar", 20.3f,17.3f,(byte)20);
        Lashya.showStudent();
        float[] cie ={23.3f,15.0f,19.4f};
        Lashya.setStudent("Nidhima",cie,(byte)10);
        Lashya.showStudent();
	}
}

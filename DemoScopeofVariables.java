package w2;
class Hospital
{
	String patientName;
	int patientid;
	static String DocName="Dr.Murthy";
	
	void sethospital(String pN,int pId)
	{
		patientName=pN;
		patientid=pId;
	}
	String getpatientName()
	{
		return patientName;
	}
	int getpatientid()
	{
		return patientid;
	}
}
public class DemoScopeofVariables
{
	public static void main(String args[])
	{
		String hospitalname="Apollo Hospital";
		Hospital patient=new Hospital();
		patient.sethospital("Anita Joseph",101);
		System.out.println("The patient"+"\t"+patient.getpatientName()+"\t"+"With the id"+"\t"+patient.getpatientid()+"\t"+"is treated by"+"\t"+patient.DocName+"\t"+"at"+"\t"+hospitalname);
	}

}

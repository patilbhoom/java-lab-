package w2;
class Employee
{
	String empName;
	int empNo;
	byte expYrs;
	String gender;
	double basicSalary;
	double bonus;
	double netSalary;
	
	void setEmployeeDetails(String name,int no,String sex,byte ex,double basicsalary)
	{
		empName=name;
		empNo=no;
		gender=sex;
		expYrs=ex;
		basicSalary=basicsalary;
	}
	void getEmployeeDetails()
	{
		if (gender=="female")
		{
			bonus=basicSalary*10/100;
			netSalary=basicSalary+bonus;
		}
		else
			netSalary=basicSalary;
		System.out.println(empName+"\t"+empNo+"\t"+gender+"\t"+expYrs+"\t"+basicSalary+"\t"+bonus+"\t"+netSalary+"\n");		
	}
}
public class EmployeeDetails
{
	public static void main(String args[])
	{
		Employee Nishmitha=new Employee();
		Nishmitha.setEmployeeDetails("Nishmitha Honur",4563,"female",(byte)20,250000.0d);
		System.out.println("empName\tempNo\tgender\texpYrs\tbasicSalary\tbonus\tnetSalary\n");
		Nishmitha.getEmployeeDetails();
		
		Employee Samarth=new Employee();
		Samarth.setEmployeeDetails("Samarth",147,"male",(byte)25,200000.0d);
		Samarth.getEmployeeDetails();
		
		Employee Kavitha=new Employee();
		Kavitha.setEmployeeDetails("Kavitha reddy",987,"female",(byte)10,100000.0d);
		Kavitha.getEmployeeDetails();
	}

}

package w3;
class Employee
{
	String empName;
	int empNo;
	String empDesig;
	byte expYrs;
	double basicSalary;
	double bonus;
	double netSalary;
	double grossSalary;
	double dearnessAllowance;
	double HRA;
	double PA;
	double IT;
	
	Employee()
	{
		empName=null;
		empNo=0;
		expYrs=0;
		empDesig=null;
		basicSalary=0.0d;
	}
	Employee(String name,int no,String des,byte ex,double basicsalary)
	{
		empName=name;
		empNo=no;
		empDesig=des;
		expYrs=ex;
		basicSalary=basicsalary;
	}
	Employee(Employee obj1,Employee obj2)
	{
		empName=obj1.empName;
		empNo=obj2.empNo;
		expYrs=obj1.expYrs;
		empDesig=obj2.empDesig;
		basicSalary=obj2.basicSalary;
	}
	void getEmployee()
	{
		dearnessAllowance=basicSalary*0.40;
		HRA=basicSalary*0.25;
		PA=basicSalary*1.0;
		grossSalary=basicSalary+dearnessAllowance+HRA+PA;
		
		IT=basicSalary*0.40;
		netSalary=grossSalary-IT;
		
		System.out.println(empName+"\t"+empNo+"\t"+empDesig+"\t\t"+expYrs+"\t\t"+basicSalary+"\t\t"+grossSalary+"\t\t"+netSalary);
	}
}
public class grosssalary 
{
	public static void main(String args[])
	{
		System.out.println("empName\tempNo\tempDesig\texpYrs\tbasicSalary\tgrossSalary\tnetSalary");
		Employee Nishmitha=new Employee();
		Nishmitha.getEmployee();
		
		Employee Samarth=new Employee("Samarth",147,"CEO",(byte)25,200000.0d);
		Samarth.getEmployee();
		
		Employee Kavitha=new Employee(Nishmitha,Samarth);
		Kavitha.getEmployee();
	}
}
package w6;
import emp.Employee;
import bonus.issueBonus;
public class demoPackage 
{
	public static void main(String args[])
	{
		System.out.println("This program illustrates use of packages");
		Employee list[]=new Employee[3];
		for (byte i=0;i<list.length;i++)
			list[i]=new Employee();
		System.out.println("\n************************************");
		System.out.println("empId\tempname\texpyears\tsalary");
		System.out.println("***************************************");
		for (byte i=0;i<list.length;i++)
		{
			issueBonus.issueEmployeeBonus(list[i]);
			list[i].getEmployee();
		}
		System.out.println("***************************************");
	}

}

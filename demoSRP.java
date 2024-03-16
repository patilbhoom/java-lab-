package w6;
import student.Student;
import requestbook.*;
import issuebook.IssueBook;
public class demoSRP 
{
	public static void main(String args[])
	{
		Student sony=new Student();
		sony.setName("Sony Mathew");
		sony.setregisterNo("119CS20001");
		requestBook rb=new requestBook();
		rb.setbookName("Java programming");
		rb.setduration(2);
		rb.searchBook();
		IssueBook iborder=new IssueBook();
		iborder.issueBook();	
	}

}

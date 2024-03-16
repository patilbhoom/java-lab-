package issuebook;
import student.Student;
import requestbook.requestBook;
public class IssueBook 
{
	private requestBook rb;
	public IssueBook() {this.rb=rb;}
	public void issueBook()
	{
		System.out.println("Issuing the book");
		System.out.println("With request id as"+this.rb.getrquestID()+"being issued to"+ this.rb.getStudent().getName());
		System.out.println("Book is to be delivered to:"+this.rb.getStudent().getregisterNo());
	}

}

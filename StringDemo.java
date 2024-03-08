package w7;
import java.lang.String;
import java.lang.StringBuffer;
public class StringDemo 
{
	public static void main(String args[])
	{
		System.out.println("This code illustrates use of string class and its methods");
		System.out.println("********************************************************");
		String str=new String("Train your mind to see Good in Everything");
		System.out.println("The initial string is:\t"+str);
		System.out.println("After replacing 'o' with 'O':\t"+str.replace('o','O'));
		System.out.println("The length of the given string is:\t"+str.length());
		System.out.println("The occurrence of characters G is at position:\t"+str.indexOf('G'));
		System.out.println("The lower case of string is:\t"+str.toLowerCase());
		System.out.println("The upper case of string is:\t"+str.toUpperCase());
		System.out.println("The extracted substring is:\t"+str.substring(27));
		String s="           Hello World          ";
		System.out.println("The string with space:"+s);
		System.out.println("The string with leading & trailing space:\t"+s);
		System.out.println("The string without space:"+s.trim());
		if(s.isEmpty())
			System.out.println("The string is empty");
		else
			System.out.println("The string is not empty.It contains"+s);
		s=null;
				System.out.println("The string is after modyfying....\t"+s);
				System.out.println("********************************************************\n\n");
				System.out.println("This code illustrates use of string buffer class and its methods");
				System.out.println("********************************************************");
				StringBuffer strbuf=new StringBuffer();
				System.out.println("The initial capacity of stringbuffer is:\t"+strbuf.capacity());
				strbuf.append("Hello");
				System.out.println("The stringbuffer is:\t"+strbuf);
				strbuf.setLength(20);
				strbuf.insert(5, "welcome to world of java");
				System.out.println("The stringbuffer is:\t"+strbuf);
				System.out.println("The capacity of stringbuffer after appending:\t"+strbuf.capacity());
				System.out.println("The reverse of given stringbuffer is:\t"+strbuf.reverse());
				System.out.println("The stringbuffer after deleting \t"+strbuf.delete(5,43));
				System.out.println("********************************************************");
	}

}

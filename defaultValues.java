package w2;
class Values
{
	byte Byte;
	int integer;
	long Long;
	short Short;
	boolean Boolean;
	String string;
	float Float;
	char ch;
	double Double;
	
	void getvalues()
	{
		System.out.println("The Default value of primitive datatype Byte:"+Byte);
		System.out.println("The Default value of primitive datatype Integer:"+integer);
		System.out.println("The Default value of primitive datatype long:"+Long);
		System.out.println("The Default value of primitive datatype short:"+Short);
		System.out.println("The Default value of primitive datatype bolean:"+Boolean);
		System.out.println("The Default value of string:"+string);
		System.out.println("The Default value of primitive datatype float:"+Float);
		System.out.println("The Default value of primitive datatype char:"+ch);
		System.out.println("The Default value of primitive datatype double:"+Double);
	}
}
public class defaultValues 
{
	public static void main(String args[])
	{
		Values var=new Values();
		var.getvalues();
	}
}
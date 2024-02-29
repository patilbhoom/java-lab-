package w3;
class MobileStore
{
	String make;
	String model;
	String category;
	double price;
	double discount;
	double netprice;
	MobileStore()
	{
		this.make="Samsung";
		this.model="Galaxy S21";
		this.category="Smart phone";
		this.price=89000.00;
		this.discount=0.15;
	}
	MobileStore(String make,String model,String category,double price,double discount)
	{
		this.make=make;
		this.model=model;
		this.category=category;
		this.price=price;
		this.discount=discount;
	}
	MobileStore(MobileStore sobj,MobileStore sobj1,MobileStore sobj2)
	{
		make=sobj.make;
		model=sobj1.model;
		category=sobj2.category;
		price=sobj.price;
		discount=sobj2.discount;
	}
	boolean getDetails()
	{
		System.out.println("***");
		System.out.println("Company name:"+make);
		System.out.println("Model:"+model);
		System.out.println("Category:"+category);
		System.out.println("price:"+price);
		System.out.println("discount:"+discount);
		System.out.println("netprice:"+calculateNetprice());
		System.out.println("***");
		return true;
	}
	double calculateNetprice()
	{
		netprice=price-(price*discount);
		return netprice;
	}
}
public class Mobile 
{
	public static void main(String args[])
	{
		MobileStore mobile1=new MobileStore();
		mobile1.getDetails();
		MobileStore iphone=new MobileStore("Apple","iphone12","Smartphone",9999.99,0.1);
		iphone.getDetails();
	}
}
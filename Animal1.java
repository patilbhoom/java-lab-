package actprgm;
class Anim
{
	String name;
	String sound;
	Anim()
	{
		name=null;
		sound=null;
	}
	Anim(String n,String s)
	{
		name=n;
		sound=s;
	}
	 void makeSound()
	{
		System.out.println("The sound of "+name+" animal is "+sound);
	}
}
public class Animal1 
{
	public static void main(String args[])
	{
		Anim cat =new Anim("Cat","mew..");
		Anim dog =new Anim("Dog","bark..");
		Anim dov =new Anim("Doves","cooo..");
		Anim hum =new Anim("Hummingbirds","hum..");
		cat.makeSound();
		dog.makeSound();
		dov.makeSound();
		hum.makeSound();
		}
}
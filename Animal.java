package actprgm;
class Ani
{
	String species;
	String sound;
	void setAni(String sp,String so)
	{
		species=sp;
		sound=so;
	}
	void getAni()
	{
		System.out.println("The animal species is\t" +species+ "\tand it's sound is " +sound);
	}
}
public class Animal 
{
	public static void main(String args[])
	{
		Ani deer =new Ani();
		Ani gir =new Ani();
		Ani dol =new Ani();
		Ani duck =new Ani();
		deer.setAni("Deer","bell");
		gir.setAni("Giraffe","bleat");
		dol.setAni("Dolphins","click");
		duck.species="Duck";
		duck.sound="quack";
		deer.getAni();
		gir.getAni();
		dol.getAni();
		duck.getAni();
	}
}

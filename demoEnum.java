package w12;
enum Signal
{
	RED,YELLOW,GREEN
}
class checkSignal
{
	Signal currentSignal;
	public checkSignal(Signal cs)
	{
		this.currentSignal=cs;
	}
	public void makeRide()
	{
		switch(currentSignal)
		{
		case RED:
			System.out.println("The signal is RED.\n Kindly wait until it turns to GREEN.");
			break;
		case YELLOW:
			System.out.println("The signal is YELLOW.\n Kindly wait look around and make safe move.");
			break;
		case GREEN:
			System.out.println("The signal is GREEN.\n Have safe ride.");
			break;
		}
	}
}
public class demoEnum 
{
	public static void main(String args[])
	{
		checkSignal myDrive=new checkSignal(Signal.GREEN);
		myDrive.makeRide();
	}
}
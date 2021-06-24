package fast;

public class MovableAdapterImpl implements MovableAdapter { 
	private Movable luxuryCars; // standard constructors
	public double getSpeed() 
	{ 
		return convertMPHtoKMPH(luxuryCars.getSpeed());
		}
	public MovableAdapterImpl (Movable luxuryCars)
	{
		super();
		this.luxuryCars = luxuryCars;
	}
	public double getPrice()
	{
		return convertUSDtoEURO(luxuryCars.getPrice());
		
	}
	private double convertUSDtoEURO(double usd) {
		// TODO Auto-generated method stub
		return usd*0.92;
	}
	private double convertMPHtoKMPH(double mph) 
	{ return mph * 1.60934; }
}
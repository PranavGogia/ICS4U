
public class Disk extends Circle
{
	private double thickness;
	
	public Disk (double r, double t){
		super(r);
		thickness = t;
	}
	
	public void setThicknesss (double newThickness )
	{
		thickness = newThickness;
	}
	public double getThickness()
	{
		return (thickness);
	}
	
	
	public double volume ()
	{
		double v;
		v = getArea() * thickness;
		return v;
	}
	public boolean equals (Object d)
	{
		Disk testObj = (Disk)d;
		if (testObj.getRadius () == super.getRadius() && testObj.getThickness() == thickness)
		{
			return (true);
		}
		else 
		{
			return (false);
		}
	}
	
	public String toString ()
	{
		String diskString;
		diskString = "The disk has radius " + super.getRadius() + " and thickness " + thickness + ".";
		return (diskString);
	}
	
	
} 
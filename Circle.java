
public class Circle implements Comparable<Circle>{
	private static final double PI = 3.14;
	private double radius;
	private double area;
	
	public Circle() {
		setRadius(1);	
	}
	
	public Circle(double r) {
		setRadius(r);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean equals(Circle c) {
		if (radius == c.getRadius())
			return true;
		else
			return false;
	}
	
	public int compareTo(Circle c) {
		
		if (radius < c.getRadius())
			return -1;
		else if (radius == c.getRadius())
			return 0;
		else
			return 1;
	}

	public double getArea()
	{
		return area;
	}
	public void setArea(Circle r) {
		this.area = PI * (Math.pow(radius, 2));
		
	}

}
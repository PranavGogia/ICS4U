package pranav;

// January 31, 2017
// This program determines what division each qualifies into
// Pranav G.

public class Puck extends Disk{

	private double weight;
	
	public Puck(double r, double t) {
		super(r, t);
		// TODO Auto-generated constructor stub
	}
	// checks whoch division the puck belongs to and returns it
	// param@ double weight
	public String getDivision(double weight)
	{
		// checks which division the puck belongs to
		String whichDivision = null;
		if (weight >= 5.0 && weight <= 5.5) {
			whichDivision ="You puck is in the standard division.";
		}
		else if (weight >= 4.0 && weight <= 4.5) {
			whichDivision = "You puck is in the youth division.";
		}
		else {
			whichDivision = "Your puck doesn't qualify for any divisions.";
		}
		
		// returns which division it belongs to
		return whichDivision;
	
		
	}
	// setter for weight
	public void setWeight(double newWeight) {
		weight = newWeight;
	}
	// getter for weight of puck
	public double getWeight() {
		return (weight);
	}
	// checks if the pucks equal each other
	public boolean equal(Puck p) {
		Puck test = (Puck) p;

		if (test.getRadius() == super.getRadius() && test.getThickness() == super.getThickness() && test.getWeight() == weight) {
			return (true);
		} else {
			return (false);
		}
	
	}
	// changes everything to a string and prints it out
	public String toString() {
		String puck;

		puck = "The puck has radius " + super.getRadius() + ", thickness " + super.getThickness() + " and weight "
				+ weight + ".";
		return (puck);
	}
	
	
}

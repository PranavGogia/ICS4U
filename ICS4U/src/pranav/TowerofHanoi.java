/*Pranav Gogia
 * September 19,2016
 * TowerofHanoi
 * This program takes in the number of discs and gives the step ny instructions on how to solve the puzzle
 */
package pranav;
// import the scanner object
import java.util.Scanner;

public class TowerofHanoi {

	/**
	 * This is the main method
	 * This method takes in the value that the user entered and sends it to the method solve
	 *
	 */
	 public static void main(String[] args) {
		   // tell the user to enter number of discs
	       System.out.print("Enter number of discs: ");
	       // initiate scanner
	       Scanner scanner = new Scanner(System.in);
	       // take the input
	       int discs = scanner.nextInt();
	       // give the method 'solve' the values discs
	       solve(discs, "Source", "Auxiliary", "Destination");
	   }
	
	
	 /**
		 * This method determines the number of digits and increases the counter and then sends the counter value back to the main method
		 * @param n is entered by the user and the string source, auxiliary and destination are initiated
		 * 
		 */
	public static void solve(int n, String source, String auxiliary, String destination) {
			// if the value the user entered reaches 0 or is 0 then this if structure returns the value
	       if (n == 0) {
	           return;
	       } else {
	    	   // value(n) - 1
	           solve(n - 1, source, destination, auxiliary);
	           System.out.println(source + " -> " + destination);
	           solve(n - 1, auxiliary, source, destination);
	       }
	   }

	  
}

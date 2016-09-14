/*Pranav Gogia
 * September 13,2016
 * NumDigits
 * This program takes in an input and outputs the number of digits in the whole number 
 */
package pranav;
import java.util.Scanner;

public class NumDigits {
	// initialize the global variable y as a counter
	public static int y = 0;
	
	
	/**
	 * This is the main method
	 * This method takes in the value that the user entered and sends it to the method numDigits and then prints the answer
	 *
	 */
	public static void main (String[] args)
{
		// initiate scanner
	Scanner scn=new Scanner(System.in);
	// take the input
	int x = scn.nextInt();	
	// print out the number of digits
	System.out.println(numDigits(x));
	scn.close();
}

	
	/**
	 * This method determines the number of digits and increases the counter and then sends the counter value back to the main method
	 * @param x is entered in (its value is what the user enters)
	 * @return y
	 */
public static int numDigits (int x)
{
	// If the number entered is 0 then 
	if (x== 0)
		// returns the value 1
	return 1;			
	// if the value of the number is anything other than 0
	else
	{
		//counter increases by 1
		y++;
		// 
		numDigits(x/10);
		
		
	}
	// return the value of y to the main method
	return y;
	
}
		
	
	
}

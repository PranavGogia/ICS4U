/*Pranav Gogia
 * September 15,2016
 * Recursion Exercise 1
 * This program takes in the number of the exponent and then prints out asterisks that are 2^number entered long
 */
package pranav;
//import the scanner object
import java.util.Scanner;

public class RecursionExcercise1 
{
	/**
	 * This is the main method
	 * This method takes in the value that the user entered and sends it to the method starString
	 *@param the value of x is given to the method starString
	 */
	public static void main(String[] args) 
	{
		
		Scanner scn=new Scanner(System.in);
		// take the input
		int x = 0;	
		// print out the number of digits
		starString(x=Integer.parseInt(scn.nextLine()));
		
	}
	/**
	 * This is the method thats does all the calculations and prints the asterisks
	 *@return the new value of x is returned
	 *@param the value of x is given to the method starString
	 */
	public static void starString (int x)
	{
		// if x == 0 then the value is returned 
		if (x==0)
		{
			System.out.println("*");
			return;
		}
			
		// takes the value of starString and then subtracts 1 from it to change to the stack value and calls the method again
		starString (x-1);
			for (int y = 0; y< Math.pow(2,x); y++)
			
								
				System.out.print("*");
				System.out.println();
				
				
				
				
			
			
		
	
		
	}

}

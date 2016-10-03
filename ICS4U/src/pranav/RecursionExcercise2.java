/*Pranav Gogia
	* September 17,2016
	 * Recursion Exercise 2
	 * This program takes in two numbers and prints out the permutations the two can have 
	 */

package pranav;
	

	import java.util.Scanner;
	

	public class RecursionExcercise2 {
	
/**
		 * This is the main method
* It gets the user input and the calls the permutations method
		 * @param args
		 */

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	
// initiate scanner
			Scanner scn=new Scanner(System.in);
			// take the input
			int n = 0;
	
			n=Integer.parseInt(scn.nextLine());
			int r = 0;
	
			r=Integer.parseInt(scn.nextLine());
			// print out the number of digits
			permutations(n,r);	
	

		}
/**
		 * This method calls the factorial method, calculates the number of permutation the two numbers can have and then prints them
		 * @param int n
		 * @param int r
		 */

		public static void permutations (int n, int r)
		{
	

			int num1 = factorial(n);
			int num2 = factorial(n-r);
	

			System.out.println(num1/num2);
	

	

	

		}
/**This method gets a number and returns its factorial.
		 * @param n
		 * @return r
		 */

		public static int factorial(int x)
		{
	

			if (x==1)
			{
				return x;
			}
	

	

			return x*factorial(x-1);
	

		}
	

	

	

	}


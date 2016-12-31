/* Searches Program
 * This program is made to use and test the searches program
 * Pranav Gogia
 * November 9, 2016
 */

import java.util.Scanner;

public class SearchesTester {

	public static void main(String[] args) {
		int x = 0;
		double y = 0.0;
		String z = "";
		// all the arrays
		int [] ints = {1,2,7,3,19,9,11,12,14,21,22,24};
		double [] doubles = {1.0,2.0,7.0,5.0,11.0,17.0,12.0,1.5,14.0,19.0,20.0,25.0};
		String [] strings = {"america","canada","denmark","goa","holland","celand","king","london","mandarin","ping","russia","slovakia","zoo"};
		Scanner scn = new Scanner(System.in);
		//Test

		// way to test the program
		System.out.println("Which search would you like to use?(binary/linear)");
		String answerBL = scn.nextLine();
		if (answerBL.equalsIgnoreCase("Linear"))
		{
			System.out.println("What type would you like to search for? (int/double/string)");
			String answerIDS = scn.nextLine();
			if (answerIDS.equalsIgnoreCase("int"))
			{
				System.out.println("Please type in the number you want to search from the given array");
				System.out.println("If the program returns -1 then the value does not exist in the array");
				x = scn.nextInt();
				System.out.println("Linear int  Target: " + x);
				System.out.println(Searches.linear(ints, x));
			}
			else if(answerIDS.equalsIgnoreCase("double"))
			{
				System.out.println("Please type in the number you want to search from the given array");
				System.out.println("If the program returns -1 then the value does not exist in the array");
				y = scn.nextDouble();
				System.out.println("Linear double Target: " + y);
				System.out.println(Searches.linear(doubles, y));
			}
			else if(answerIDS.equalsIgnoreCase("string"))
			{
				System.out.println("Please type in the word you want to search from the given array");
				System.out.println("If the program returns -1 then the value does not exist in the array");
				z = scn.nextLine();
				System.out.println("Linear string Target: " +z);
				System.out.println(Searches.linear(strings, z));
			}
			else
			{
				System.out.println("Please start again");
				System.exit(1);

			}

		}
		else if (answerBL.equalsIgnoreCase("Binary"))
		{
			System.out.println("What type would you like to search for? (int/double/string)");

			String answerIDS = scn.nextLine();
			if (answerIDS.equalsIgnoreCase("int"))
			{
				System.out.println("Please type in the number you want to search from the given array");
				System.out.println("If the program returns -1 then the value does not exist in the array");
				x = scn.nextInt();
				System.out.println("Binary int Target: " +x);
				System.out.println(Searches.binary(ints, x));
			}
			else if(answerIDS.equalsIgnoreCase("double"))
			{
				System.out.println("Please type in the number you want to search from the given array");
				System.out.println("If the program returns -1 then the value does not exist in the array");
				y = scn.nextDouble();
				System.out.println("Binary double Target: " +y);
				System.out.println(Searches.binary(doubles, y));
			}
			else if(answerIDS.equalsIgnoreCase("string"))
			{
				System.out.println("Please type in the word you want to search from the given array");
				System.out.println("If the program returns -1 then the value does not exist in the array");
				z = scn.nextLine();
				System.out.println("Binary string Target: " +z);
				System.out.println(Searches.binary(strings, z));
			}
			else
			{
				System.out.println("Please start again");
				System.exit(1);
			}

		}
		else
		{
			System.out.println("Please start again");
			System.exit(1);
		}















	}
}
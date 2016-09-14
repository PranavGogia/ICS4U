package pranav;

import java.util.Scanner;

public class RecursionExcercise1 
{

	public static void main(String[] args) 
	{
		
		Scanner scn=new Scanner(System.in);
		// take the input
		int x = scn.nextInt();	
		// print out the number of digits
		System.out.println(starString(x));
		scn.close();
		
		
	}

	public static int starString (int x)
	{
		if (x==0)
		{
			return 1;
		}
		
		else if (x <0)
		{
			System.out.println("Error");
		
		}
		else
		{
			for (int y = 0; y<= Math.pow(2,x); y++)
			{
								
				System.out.print("*");
				
				
				
				
			}
			
		}
		return x;
		
	}

}

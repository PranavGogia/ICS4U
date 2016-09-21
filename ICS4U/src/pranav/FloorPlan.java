package pranav;

import java.util.Scanner;

public class FloorPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Scanner scn=new Scanner(System.in);
		// take the input
		int x = 0;
		x=scn.nextInt();
	
		int r = 0;
		r=scn.nextInt();
		if (r <= 0)
		{
			System.out.println("Cannot work as there are no rows ");
		}

		int c = 0;
		c=scn.nextInt();
		if (c <= 0)
		{
			System.out.println("Cannot work as there are no coloums ");
		}
		
		int array [][] = new int[r][c];
		
		recursion(x, c, r);

		
		
		
		
		

	}

	public static int recursion(int x, int c, int r)
	{
		if (x ==0)
		{
			return x;
		}
		else 
		{
			return x = recursion (x - 1, c, r);
		}
		
		
		
		
			
		






	}






}

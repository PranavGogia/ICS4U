package pranav;

import java.util.Scanner;

public class RecursionExcercise2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		// take the input
		int n = 0;
		System.out.println("Please type in the first number");
		n=Integer.parseInt(scn.nextLine());
		int r = 0;
		System.out.println("Please type in the second number");
		r=Integer.parseInt(scn.nextLine());
		// print out the number of digits
		permut(n,r);	

	}
	public static void permut (int n, int r)
	{

		int num1 = factorial(n);
		int num2 = factorial(n-r);

		System.out.println(num1/num2);



	}
	public static int factorial(int x)
	{

		if (x==1)
		{
			return x;
		}


		return x*factorial(x-1);

	}



}

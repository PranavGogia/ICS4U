package pranav;

//January 31, 2017
//This is a test case to see what program the puck belongs to
//Pranav G.

import java.util.Scanner;

public class TestPuck {

	
	
	public static void main(String[] args) {
		
		Puck newPuck1 = new Puck(16, 0.05);
		System.out.println("What is the weight of the first puck?");
		Scanner scn = new Scanner(System.in);
		newPuck1.setWeight(scn.nextDouble());
		System.out.println(newPuck1.getDivision(newPuck1.getWeight()));
		
		Puck newPuck2= new Puck(16, 0.05);
		System.out.println("What is the weight of the second puck?");
		newPuck2.setWeight(scn.nextDouble());
		System.out.println(newPuck2.getDivision(newPuck2.getWeight()));
		
		if (newPuck1.equals(newPuck2)){
			System.out.println("Puck 1 and Puck2 are equal.");
		} else {
			System.out.println("Puck 1 and Puck2 are not equal.");
		}
		
		System.out.println(newPuck1);
		System.out.println(newPuck2);
		
	}
	
	
	
	
}

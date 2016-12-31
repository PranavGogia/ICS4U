import java.util.Scanner;

public class SortingTester {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] simpleIntArray = {5, 3, 4, 6, 9, 10, 15, 14, 16, 2, 1, 23, 13,-5, 11};
		double[] simpleDoubleArray = {5.0, 3.0, 4.0, 6.0, 9.0, 10.0, 15.0, 14.0, 16.0, 12.0, 1.0, 23.0, 13.0, -5.0, 1.0};
		String[] simpleStringArray = {"America", "Phillipines", "Brazil", "Holland", "Canada","Chile", "India"};
		Scanner scn = new Scanner(System.in);
		System.out.println("What type of sort would you like to use? (selection/insertion/bubble/merge/quick");
		String answerType = scn.nextLine();

		if (answerType.equalsIgnoreCase("selection"))
		{
			System.out.println("What type of array would you sort? (int/double/string)");
			String answerIDS = scn.nextLine();
			if (answerIDS.equalsIgnoreCase("int"))
			{
				for(int i =0; i<simpleIntArray.length;i++)
					System.out.println(simpleIntArray[i]);

				Sorting.selection(simpleIntArray);

				System.out.println("");

				for(int j =0; j<simpleIntArray.length;j++)
					System.out.println(simpleIntArray[j]);

			}
			else if(answerIDS.equalsIgnoreCase("double"))
			{
				for(int i =0; i<simpleDoubleArray.length;i++)
					System.out.println(simpleDoubleArray[i]);

				Sorting.selection(simpleDoubleArray);

				System.out.println("");

				for(int j =0; j<simpleDoubleArray.length;j++)
					System.out.println(simpleDoubleArray[j]);


			}
			else if(answerIDS.equalsIgnoreCase("string"))
			{
				for(int i =0; i<simpleStringArray.length;i++)
					System.out.println(simpleStringArray[i]);

				Sorting.selection(simpleStringArray);

				System.out.println("");

				for(int j =0; j<simpleStringArray.length;j++)
					System.out.println(simpleStringArray[j]);
			}
			else
			{
				System.out.println("Please start again");
				System.exit(1);

			}

		}
		else if (answerType.equalsIgnoreCase("insertion"))
		{
			System.out.println("What type of array would you sort? (int/double/string)");
			String answerIDS = scn.nextLine();
			if (answerIDS.equalsIgnoreCase("int"))
			{

				for(int i =0; i<simpleIntArray.length;i++)
					System.out.println(simpleIntArray[i]);

				Sorting.insertion(simpleIntArray);

				System.out.println("");

				for(int j =0; j<simpleIntArray.length;j++)
					System.out.println(simpleIntArray[j]);
			}
			else if(answerIDS.equalsIgnoreCase("double"))
			{
				for(int i =0; i<simpleDoubleArray.length;i++)
					System.out.println(simpleDoubleArray[i]);

				Sorting.insertion(simpleDoubleArray);

				System.out.println("");

				for(int j =0; j<simpleDoubleArray.length;j++)
					System.out.println(simpleDoubleArray[j]);


			}
			else if(answerIDS.equalsIgnoreCase("string"))
			{
				for(int i =0; i<simpleStringArray.length;i++)
					System.out.println(simpleStringArray[i]);
				
				Sorting.insertion(simpleStringArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleStringArray.length;j++)
					System.out.println(simpleStringArray[j]);
			}
			else
			{
				System.out.println("Please start again");
				System.exit(1);

			}

		}
		else if (answerType.equalsIgnoreCase("bubble"))
		{
			System.out.println("What type of array would you sort? (int/double/string)");
			String answerIDS = scn.nextLine();
			if (answerIDS.equalsIgnoreCase("int"))
			{

				for(int i =0; i<simpleIntArray.length;i++)
					System.out.println(simpleIntArray[i]);
				
				Sorting.bubble(simpleIntArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleIntArray.length;j++)
					System.out.println(simpleIntArray[j]);
			}
			else if(answerIDS.equalsIgnoreCase("double"))
			{
				for(int i =0; i<simpleDoubleArray.length;i++)
					System.out.println(simpleDoubleArray[i]);
				
				Sorting.bubble(simpleDoubleArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleDoubleArray.length;j++)
					System.out.println(simpleDoubleArray[j]);


			}
			else if(answerIDS.equalsIgnoreCase("string"))
			{
				for(int i =0; i<simpleStringArray.length;i++)
					System.out.println(simpleStringArray[i]);
				
				Sorting.bubble(simpleStringArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleStringArray.length;j++)
					System.out.println(simpleStringArray[j]);
					
			}
			else
			{
				System.out.println("Please start again");
				System.exit(1);

			}

		}
		else if (answerType.equalsIgnoreCase("merge"))
		{
			System.out.println("What type of array would you sort? (int/double/string)");
			String answerIDS = scn.nextLine();
			if (answerIDS.equalsIgnoreCase("int"))
			{
				for(int i =0; i<simpleIntArray.length;i++)
					System.out.println(simpleIntArray[i]);
				
				Sorting.merge(simpleIntArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleIntArray.length;j++)
					System.out.println(simpleIntArray[j]);
				

			}
			else if(answerIDS.equalsIgnoreCase("double"))
			{
				for(int i =0; i<simpleDoubleArray.length;i++)
					System.out.println(simpleDoubleArray[i]);
				
				Sorting.bubble(simpleDoubleArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleDoubleArray.length;j++)
					System.out.println(simpleDoubleArray[j]);
				


			}
			else if(answerIDS.equalsIgnoreCase("string"))
			{
				for(int i =0; i<simpleStringArray.length;i++)
					System.out.println(simpleStringArray[i]);
				
				Sorting.bubble(simpleStringArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleStringArray.length;j++)
					System.out.println(simpleStringArray[j]);
				
			}
			else
			{
				System.out.println("Please start again");
				System.exit(1);

			}

		}
		else if (answerType.equalsIgnoreCase("quick"))
		{
			System.out.println("What type of array would you sort? (int/double/string)");
			String answerIDS = scn.nextLine();
			if (answerIDS.equalsIgnoreCase("int"))
			{
				for(int i =0; i<simpleIntArray.length;i++)
					System.out.println(simpleIntArray[i]);
				
				Sorting.quick(simpleIntArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleIntArray.length;j++)
					System.out.println(simpleIntArray[j]);

			}
			else if(answerIDS.equalsIgnoreCase("double"))
			{
				for(int i =0; i<simpleDoubleArray.length;i++)
					System.out.println(simpleDoubleArray[i]);
				
				Sorting.bubble(simpleDoubleArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleDoubleArray.length;j++)
					System.out.println(simpleDoubleArray[j]);


			}
			else if(answerIDS.equalsIgnoreCase("string"))
			{
				for(int i =0; i<simpleStringArray.length;i++)
					System.out.println(simpleStringArray[i]);
				
				Sorting.bubble(simpleStringArray);
				
				System.out.println("");
				
				for(int j =0; j<simpleStringArray.length;j++)
					System.out.println(simpleStringArray[j]);
			}
			else
			{
				System.out.println("Please start again");
				System.exit(1);

			}

		}





	}

}
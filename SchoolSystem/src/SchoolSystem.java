import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystem {
	public static Scanner scn=new Scanner(System.in);

	public static ArrayList<Student> studRecs = new ArrayList<Student>();



	public static void main(String[] args) {
		// TODO Auto-generated method stub




		Scanner scnMain = new Scanner(System.in);
		int mainCounter = 0;

		
		System.out.println("What would like to do? Please type in the number of the task you would like to perform");
		System.out.println("1. Enter a new student");
		System.out.println("2. Print student");
		System.out.println("3. Print all students");
		System.out.println("4. Remove student");
		System.out.println("5. replace student info");
		System.out.println("10. Quit");
		do {

			
			mainCounter = (scnMain.nextInt());


			if(mainCounter == 1 )
			{
				addStudent();	
			}	
			else if(mainCounter == 2 )
			{
				System.out.println("Print student");	
			}	
			else if(mainCounter == 3 )
			{
				System.out.println("Print all student");		
			}	
			else if(mainCounter == 4 )
			{
				System.out.println("Remove student");	
			}	
			else if(mainCounter == 5 )
			{
				System.out.println("Replace student info");	
			}	
			else if( mainCounter == 10)
			{
				quit();	
			}

			else
			{
				System.out.println("Please enter a valid input");
				mainCounter = (scnMain.nextInt());
			}

			} while (mainCounter == 0);









		}



		public static void addStudent() 

		{
			studRecs.add(new Student());


			Student student1 = new Student();
			System.out.println("Please type in your first name");
			studRecs.get(studRecs.size() -1).setFirstName(scn.nextLine());
			System.out.println("Please type in your last name");
			studRecs.get(studRecs.size() -1).setLastName(scn.nextLine());
			System.out.println("Please type in your birthdate in the dd/mm/yyyy format");
			studRecs.get(studRecs.size() -1).setBirthDate((((scn.nextLine()))));
			System.out.println("Please type in your your adress");
			studRecs.get(studRecs.size() -1).setStreetAdress(scn.nextLine());
			System.out.println("Please type in your postal code");
			studRecs.get(studRecs.size() -1).setPostalCode(scn.nextLine());
			System.out.println("Please type in the name of the city you live in");
			studRecs.get(studRecs.size() -1).setCity(scn.nextLine());
			System.out.println("Please type in the name of the province you live in");
			studRecs.get(studRecs.size() -1).setProvince(scn.nextLine());
			System.out.println("Please type in your phone number");
			studRecs.get(studRecs.size() -1).setPhoneNumber((Long.parseLong(scn.nextLine())));


			if (student1.getPhoneNumber() <= 9999999999.0 && student1.getPhoneNumber() >= 1000000000)
			{
				System.out.println("Please type in a valid number ");
			}

			else
			{
				print();
			}



		}

		public static void print()
		{
			System.out.println("First Name:  " + studRecs.get(studRecs.size() -1).getFirstName());
			System.out.println("Last Name:  " + studRecs.get(studRecs.size() -1).getLastName());
			System.out.println("Birthdate:  " + studRecs.get(studRecs.size() -1).getBirthDate());
			System.out.println("Adress:  " + studRecs.get(studRecs.size() -1).getStreetAdress());
			System.out.println("Postal Code:  " + studRecs.get(studRecs.size() -1).getPostalCode());
			System.out.println("City:  " + studRecs.get(studRecs.size() -1).getCity());
			System.out.println("Province:  " + studRecs.get(studRecs.size() -1).getProvince());
			System.out.println("Phone Number:  " + studRecs.get(studRecs.size() -1).getPhoneNumber());

		}


		public static void quit()
		{
			System.exit(0);

		}

















	}

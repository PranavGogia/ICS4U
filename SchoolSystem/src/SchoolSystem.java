/*
 * SchoolSystem Project
 *  Pranav Gogia
 * This program take in the information about a student, it can then remove the info, edit it , save it to file and load it from file
 */
// imports all the files needed for the program
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
// all the global variables are defined here
public class SchoolSystem {
	// this is the array list called studRecs
	public static ArrayList<Student> studRecs=new ArrayList<Student>();
	// Initiating scanner scn
	public static Scanner scn=new Scanner (System.in);
	// naming the file where the information will be saved
	public static File file=new File("src/students.txt");	
	// initiating buffered reader fbr
	public static BufferedReader fbr;
	// initiating file output stream called fileOutputStream
	public static FileOutputStream fileOutputStream;
	// initiating PrintStream called fps
	public static PrintStream fps;
	// initializing variable to get user to choose what option they want
	public static int option=0;

	/**
	 * This method is called up first and sets up the file and the way to output information to it and then get the information back
	 */
	public static void setUp()
	{
		//  tells the program where to output the information
		try {
			fileOutputStream = new FileOutputStream ("src/students.txt");
			fbr=new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// looks at whether the file exists or not
			if (!file.exists())
				try {
					// if it doesn't then this creates it
					file.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		fps=new PrintStream(fileOutputStream);
		menu();
	}
	/**
	 * This is the main method. It is only used to call the menu method
	 * @param args
	 */
	public static void main(String[] args)
	{
		// calls the setup method that initiates the saving and loading 
		setUp();

	}

	public static void menu()
	{
		// counter is initialized to determine which option the user chooses
		int mainCounter = 0;
		// All the options are printed out for the user to choose from

		System.out.println("Please enter the number of the option you would like to use.");
		System.out.println("1. Add New Student");
		System.out.println("2. Find Student");
		System.out.println("3. Print Last Student");
		System.out.println("4. Print All Students");
		System.out.println("5. Sort All Students");
		System.out.println("6. Save to file");
		System.out.println("7. Load from file");
		System.out.println("8. Quit");
		// loop around the whole program
		while (true) {
			try {
				mainCounter = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException ie) {
				System.out.println("Please enter a correct value.");

			}
			// if the user wants to add a new student then the ageChecker is called first to verify the users age
			if(mainCounter == 1 )
			{
				ageChecker();	
			}	
			else if(mainCounter == 2 )
			{
				if (studRecs.size() >1)
				{
					// searching for the student
					System.out.println("Please input the last name of the student you would like to find.");
					Student search=findStudent(scn.nextLine());
					// if no student with that last name is found in the list

					if(search==null)
					{
						System.out.println("There is no student with that last name in the records.");
					}
					// if there is a student with that last name then the following is outputed
					else{
						System.out.println("1. Print Student's Information");
						System.out.println("2. Remove Student");
						System.out.println("0. Back");
						try{
							mainCounter=scn.nextInt();

						}catch(IllegalArgumentException e){
							System.out.println("Please enter a valid number.");
						}
						// if the user wants the output the students information then this call the printSingle method and prints out the info
						if
						(mainCounter==1)
							printSingle(search);
						// removes the students info if wanted
						else if(mainCounter==2)
							removeStudent(search);
						// just goes back to the menu if the user wants that
						else if (mainCounter==0);
						menu();	
					}
				}
				else
				{
					System.out.println("Please enter in the student information first");
					menu();
				}

			}	
			// prints all the information in the array list
			else if(mainCounter == 4 )
			{// if the array list doesnt have information then the program ends
				if (studRecs.size()<1)
				{
					System.out.println("Please enter in the student information first");
				}
				else
				{
					printAll();
				}

			}	
			// prints the last students information 
			else if(mainCounter == 3)
			{// if the array list doesnt have information then the program ends
				if (studRecs.size()<1)
				{
					System.out.println("Please enter in the student information first");
				}
				else
				{
					print();
				}
			}
			// sorts the array list based on last names
			else if(mainCounter == 5 )
			{// if the array list doesnt have information then the program ends
				if (studRecs.size()<1)
				{
					System.out.println("Please enter in the student information first");
				}
				else
				{
					sort();	
				}

			}	
			// calls 
			else if(mainCounter == 6 )
			{
				try {
					saveStudents();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			else if(mainCounter == 7 )
			{
				try {
					loadFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			else if(mainCounter == 8)
			{
				quit();

			}


			else
			{
				System.out.println("Please enter a valid input");

				menu();
			}
		}


	}

	public static void ageChecker()
	{
		// Initializes the birth variable
		int birthD = 0;
		String birthD2 = null;

		System.out.println("Please enter the student's birth year");
		// asks the user to enter in the year they were born

		birthD2 = scn.nextLine();



		//takes the input and turns it into an integer
		do{
			try{
				birthD = Integer.parseInt(birthD2);

			}catch(NumberFormatException e){
				System.out.println("Please enter a valid number.");
				ageChecker();
			}
		}while(birthD %1 != 0);
		// only allows the user to proceed if they are over the age if they are between the ages of 13 and 18
		// subtracts the users birthdate from 2016
		int yearDifference = 2016 - birthD;
		if(yearDifference < 13 )
		{
			// if the user is less than 13 years of age then it tells the user they are too young
			int waitTime = 13 - yearDifference;
			System.out.println("You are too young to apply to Runnymede C.I.");
			// if the user is 1 years younger than they need to be to apply to high school then this tells them that
			if (waitTime == 1)
			{
				System.out.println("You need to wait one year!");
				System.exit(0);
			}
			// if the user is less than 13 years of age then it tells the user they are too young and how many years they need to wait
			else if (waitTime > 1)
			{
				System.out.println("You need to wait, " + waitTime + " years");
				System.exit(0);
			}
		}
		// if the user is older than 18 years of age then it tells the user they are too old
		else if (yearDifference > 18)
		{
			System.out.println("You are too old to apply to High School, sorry!");
			System.exit(0);
		}
		else 
		{
			addStudent();
		}




	}


	/**
	 * This methods adds a single student to the student records.
	 * @throws Exception 
	 */
	public static void addStudent()
	{
		boolean checker=true;
		String postalCode=null;
		// asks the user to enter the first name
		System.out.println("Please enter the student's first name.");
		String firstName=scn.nextLine();
		// asks the user to enter the last name
		System.out.println("Please enter the student's last name.");
		String lastName=scn.nextLine();

		// asks the user to enter the phone number
		System.out.println("Please enter the phone number.");
		String phoneNumber=null;
		while(checker){
			phoneNumber=scn.nextLine();
			// if the phones number isnt 10 charecters long then it doesnt goe through and asks the user to enter a proper phone number
			if (phoneNumber.length()==10)
			{
				// looks through the full inout and checks if each charecter is a number
				for (int i=0;i<10;i++){
					if(!checkInt(phoneNumber.charAt(i))){
						System.out.println("Please enter a valid phone number.");
						break;
					}
					if (i==9){
						checker=false;
					}
				}
			}
			else{
				System.out.println("Please enter a valid phone number.");
			}
		}
		// asks the user to enter the adress
		System.out.println("Please enter the address.");
		String address=scn.nextLine();
		// asks the user to enter the city
		System.out.println("Please enter the city.");
		String city=scn.nextLine();
		// asks the user to enter the province
		System.out.println("Please enter the province using TWO letter code(ex- ON for Ontario)");
		//
		checker=true;
		String province=scn.nextLine().toLowerCase();
		Province valid=checkProvince(province.toLowerCase());
		// asks the user to enter the postal code
		System.out.println("Please enter the postal code.");
		while(checker==true){
			postalCode=scn.nextLine().toLowerCase();
			checker=true;
			// if the postal code is not long enough or too long then it asks the user to enter a new value again
			if (postalCode.length()!=6){
				System.out.println("Invalid postal code. Please enter a valid one.");
			}
			else{
				// goes through the postal code entered and checks if it follows the format correctly
				for (int i=0;i<6;i++){
					if ((i==0)&&(!checkChar(postalCode.charAt(i)))||(i==2)&&(!checkChar(postalCode.charAt(i)))||(i==4)&&(!checkChar(postalCode.charAt(i)))){
						System.out.println("Invalid postal code. Please enter a valid one.");
						break;
					}
					// goes through the postal code entered and checks if it follows the format correctly
					else if ((i==1)&&(!checkInt(postalCode.charAt(i)))||(i==3)&&(!checkInt(postalCode.charAt(i)))||(i==5)&&(!checkInt(postalCode.charAt(i)))){
						System.out.println("Invalid postal code. Please enter a valid one.");
						break;
					}	
					if (i==5){
						checker=false;
					}
				}
			}
		}
		String birthday;
		System.out.println("Please enter the birth day (dd/mm/yyyy).");
		while(true){
			// take in what the user entered and splits it and enter it into an array
			birthday=scn.nextLine();
			String [] bday = birthday.split("/");

			//initializes the variables 
			int a = 0;
			int b = 0;
			int c = 0;
			// puts the values from bday into these variables
			try {
				//printIntro();
				a = Integer.parseInt(bday[0]);
				b = Integer.parseInt(bday[1]);
				c = Integer.parseInt(bday[2]);
				//break;
			} catch (NumberFormatException ie) {
				System.out.println("Please enter a correct value.");
			}


			// checks if the value entered does follow the order it should 
			if ((birthday.length()==10)&&(birthday.charAt(2)=='/')&&(birthday.charAt(5)=='/')&&(a%1 ==0) && (b%1 ==0) && (c%1 ==0)){
				break;
			}
			else{
				System.out.println("Please enter a valid birthday");
			}
		}
		// adds a new student to the array list
		studRecs.add(new Student(firstName,lastName,phoneNumber,address,city,valid,postalCode,birthday));


		menu();
	}

	/**
	 * This method just prints the last student info entered
	 */
	public static void print()
	{
		int i = studRecs.size()-1;
		System.out.println("First Name: " +studRecs.get(i).getFirstName());
		System.out.println("Last Name: " +studRecs.get(i).getLastName());
		System.out.println("Phone Number: " +studRecs.get(i).getPhoneNumber());
		System.out.println("Address: " +studRecs.get(i).getAddress());
		System.out.println("City: " +studRecs.get(i).getCity());
		System.out.println("Province: " +studRecs.get(i).getProvince());
		System.out.println("Postal Code: " +studRecs.get(i).getPostalCode());
		System.out.println("Birthdate: " +studRecs.get(i).getBirthday());
		System.out.println("Student Number: " +studRecs.get(i).getStudentNumber());
	}



	/**
	 * This method checks if the charecter is a number
	 * @param x
	 * @return
	 */
	public static boolean checkInt(char x){
		if (x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9')
			return true;
		else
			return false;
	}
	/**
	 * This method checks if the character is a char
	 * @param x
	 * @return
	 */
	public static boolean checkChar(char x){
		if (x=='a'||x=='b'||x=='c'||x=='d'||x=='e'||x=='f'||x=='g'||x=='h'||x=='i'||x=='j'||x=='k'||x=='l'||x=='m'||x=='n'||x=='o'||x=='p'||x=='q'||x=='r'||x=='s'||x=='t'||x=='u'||x=='v'||x=='w'||x=='x'||x=='y'||x=='z')
			return true;
		else
			return false;
	}
	/**
	 * This method quits the program.
	 */
	public static void quit()
	{
		System.out.println("Thank you for using Pranav Organizer Thingy");

		System.exit(0);
	}
	/**
	 * This method uses the last name of a student to find them in the records
	 * @param lastName
	 * @return
	 */
	public static Student findStudent(String lastName){
		// looks through the array for the last name entered and returns the number where the student is
		for (int i=0;i<studRecs.size();i++){
			if (studRecs.get(i).getLastName().equals(lastName))
				return studRecs.get(i);	
		}
		return null;
	}
	/**
	 * This method prints out one students information provided that it is given the student number
	 * @param x
	 * @throws Exception 
	 */
	public static void printSingle(Student x){
		System.out.println(x.getFirstName());
		System.out.println(x.getLastName());
		System.out.println(x.getPhoneNumber());
		System.out.println(x.getAddress());
		System.out.println(x.getCity());
		System.out.println(x.getProvince());
		System.out.println(x.getPostalCode());
		System.out.println(x.getBirthday());
		System.out.println(x.getStudentNumber());
		System.out.println();
		main(null);
	}
	/**
	 * Given a student, this method removes that student from the student records.
	 * @param x
	 * @throws Exception 
	 */
	public static void removeStudent(Student x) {
		studRecs.remove(x);
		menu();;
	}
	/**
	 * This method outputs all information the student records has.
	 * @throws Exception 
	 */
	public static void printAll() {
		// prints all the information in the array list
		for (int i=0;i<studRecs.size();i++){
			System.out.println("First Name: " +studRecs.get(i).getFirstName());
			System.out.println("Last Name: " +studRecs.get(i).getLastName());
			System.out.println("Phone Number: " +studRecs.get(i).getPhoneNumber());
			System.out.println("Address: " +studRecs.get(i).getAddress());
			System.out.println("City: " +studRecs.get(i).getCity());
			System.out.println("Province: " +studRecs.get(i).getProvince());
			System.out.println("Postal Code: " +studRecs.get(i).getPostalCode());
			System.out.println("Birthdate: " +studRecs.get(i).getBirthday());
			System.out.println("Student Number: " +studRecs.get(i).getStudentNumber());
		}

	}
	/**
	 * This method saves the information in the array into a file
	 * @throws Exception 
	 */
	public static void saveStudents () throws IOException
	{
		// creates the file 
		String fileName = "src/student.txt";
		String studentNumber = "src/studentNumber.txt";
		File file = new File(fileName);
		File stuFile = new File(studentNumber);
		// if the file doesn't exist then it creates it
		if (!file.exists())
			file.createNewFile();
		if (!stuFile.exists())
			stuFile.createNewFile();

		FileOutputStream wfn = new FileOutputStream(fileName);
		PrintStream writeFile = new PrintStream(wfn);
		FileOutputStream wsn = new FileOutputStream(studentNumber);
		PrintStream writeStuNum = new PrintStream(wsn);
		// only happens if the array list had information in it
		if(studRecs.size() >0)
		{
			writeStuNum.println(studRecs.get(studRecs.size() - 1).getStudentNumber());
		}		
		// if there is no info in the array list then 
		else
		{
			System.out.println("Please enter in student information before saving");
			System.out.println("");
		}
		try{
			// outputs the user information to the file
			if (studRecs.size() > 0)
			{
				for (int i=0;i<studRecs.size();i++){
					writeFile.print(studRecs.get(i).getFirstName());
					writeFile.print(",");
					writeFile.print(studRecs.get(i).getLastName());
					writeFile.print(",");
					writeFile.print(studRecs.get(i).getPhoneNumber());
					writeFile.print(",");
					writeFile.print(studRecs.get(i).getAddress());
					writeFile.print(",");
					writeFile.print(studRecs.get(i).getCity());
					writeFile.print(",");
					writeFile.print(studRecs.get(i).getProvince());
					writeFile.print(",");
					writeFile.print(studRecs.get(i).getPostalCode());
					writeFile.print(",");
					writeFile.print(studRecs.get(i).getBirthday());
					writeFile.print(",");
					writeFile.print(studRecs.get(i).getStudentNumber());
				}

			}
			// if the array list does have information then this is allowed
			if (studRecs.size() >0)
			{
				System.out.println("File Saved");
			}
			// if the array list does have information then this is allowed
			if(studRecs.size() >0)
			{
				// removes the information from the array list when the information has been saved
				for (int i = 0; i < studRecs.size() - 1; i++) 
				{
					studRecs.remove(i);
				}
			}
			wfn.close();
			wsn.close();
		} catch (ArrayIndexOutOfBoundsException ie) {

		}
	}
	/**
	 * This method loads information from the file into the array list
	 * @throws Exception 
	 */
	public static void loadFile () throws IOException
	{
		long lastStudentNumber = 0;	
		{
			// makes a new list
			ArrayList<Student> tempStudentList = null;
			// declares the names of the text files and creates the file
			String fileName = "src/student.txt";
			String studentNumber = "src/studentNumber.txt";
			File file = new File(fileName);
			File stuFile = new File(studentNumber);
			BufferedReader readFile = new BufferedReader (new FileReader(fileName));
			BufferedReader readStuNum= new BufferedReader (new FileReader(stuFile));
			// if the file doenst exist then this creates it
			if (!file.exists())
				file.createNewFile();
			if (!stuFile.exists())
				stuFile.createNewFile();

			//Read the last student number used
		//	String lastStuNum = readStuNum.readLine();
			//lastStudentNumber = Long.parseLong(lastStuNum);
			//Read the student information corresponding to the student number 
			// reads the line in the file
			String studentInfo = readFile.readLine();
			// splits the saved info in the file and saves it in an array
			try{
				String[] splits = studentInfo.split(",");


				// goes through the splits arrays and then enters the information into the studRecs array list
				for (int i = 0; i < (splits.length/8); i ++)
				{
					tempStudentList.add(new Student(splits[0], splits[1], splits[2], splits[3], splits[4], splits[5], splits[6], splits[7]));
				}	
				studRecs = tempStudentList;
			} catch (NullPointerException ie) {

			}




		}
		// if there is nothing in the list then this message is printed
		if(studRecs.size()<1)
		{
			System.out.println("Please enter student information and save it before loading it");
		}
		// if there indeed is something in the list then this message is printed
		else
		{
			System.out.println("...Succesfully loaded...");
		}


		//	studRecs = tempStudentList;
	}




	/**
	 * This method sorts the students in the record based on last name and then prints out the full list
	 */
	public static void sort(){
		// sorts the list based on last name
		Collections.sort(studRecs);
		// prints out the full list
		for (int i=0;i<studRecs.size();i++){
			System.out.println(studRecs.get(i).getFirstName());
			System.out.println(studRecs.get(i).getLastName());
			System.out.println(studRecs.get(i).getPhoneNumber());
			System.out.println(studRecs.get(i).getAddress());
			System.out.println(studRecs.get(i).getCity());
			System.out.println(studRecs.get(i).getProvince());
			System.out.println(studRecs.get(i).getPostalCode());
			System.out.println(studRecs.get(i).getBirthday());
			System.out.println();
		}
	}
	/**
	 * This method takes in the short form of the province entered and returns an enum constant
	 * @param input
	 * @return Province
	 */
	public static Province checkProvince(String input){
		// turns the input provided to lower case so thats its easier to compare
		input = input.toLowerCase();
		while (true){
			//checks if the province input is valid

			// replaces the short form for the province to Alberta
			switch (input){
			case "ab":
			case "alberta":
				return Province.ALBERTA;
				// replaces the short form for the province to British Columbia
			case "bc":
			case "british columbia":
			case "britishcolumbia":

				return Province.BRITISHCOLUMBIA;

				// replaces the short form for the province to New Brunswick
			case "nb":
			case "new brunswick":
			case "newbrunswick":
				return Province.NEWBRUNSWICK;

				// replaces the short form for the province to Manitoba
			case "mb":
			case "manitoba":
				return Province.MANITOBA;

				// replaces the short form for the province to Nova Scotia
			case "ns":
			case "novascotia":
			case "nova scotia":
				return Province.NOVASCOTIA;
				// replaces the short form for the province to Northwest Territories
			case "nt":
			case "northwest territories":
			case "north west territories":
			case "northwestterritories":
				return Province.NORTHWESTTERRITORIES;

				// replaces the short form for the province to Nunavut
			case "nu":
			case "nunavut":
				return Province.NUNAVUT;

				// replaces the short form for the province to Ontario
			case "on":
			case "ontario":
				return Province.ONTARIO;
				// replaces the short form for the province to Quebec
			case "qc":
			case "quebec":
				return Province.QUEBEC;
				// replaces the short form for the province to Prince Edward Island
			case "pe":
			case "princeedwardisland":
			case "prince edward island":
				return Province.PRINCEEDWARDISLAND;
				// replaces the short form for the province to Saskatchewan
			case "sk":
			case "saskatchewan":
				return Province.SASKATCHEWAN;
				// replaces the short form for the province to Yukon
			case "yt":
			case "yukon":
				return Province.YUKON;
				// if no valid short form is entered then this message is printed
			default:{
				System.out.println("Please input a valid province");
				input=scn.nextLine().toLowerCase();
			}	
			}
		}
	}
}

















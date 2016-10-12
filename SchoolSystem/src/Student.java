



public class Student  implements Comparable{

	
	private String firstName;
	private String lastName;
	private String streetAdress;
	private String city;
	private String province;
	private long phoneNumber;
	private String postalCode;
	private String birthDate;
	private static long idGenerator = 342000000;
	private long studentNumber;
	private String apartment;
	public Student (String name ,String secondName, String adress, String municipality, String lprovince , long number,String post, String birth ){


		setFirstName(name);
		setLastName(secondName);
		setStreetAdress(adress);
		setCity(municipality);
		setProvince(lprovince);
		setPhoneNumber(number);
		setPostalCode(post);
		setBirthDate(birth);

	}

	
	
	

	public Student(){

		try {
			throw new InvalidInputException();
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.studentNumber = idGenerator;
		idGenerator++;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}









	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the streetAdress
	 */
	public String getStreetAdress() {
		return streetAdress;
	}
	/**
	 * @param streetAdress the streetAdress to set
	 */
	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	/**
	 * @return the apartment
	 */
	public String getApartment() {
		return apartment;
	}


	/**
	 * @param apartment the apartment to set
	 */
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}


	public String toString()
	{
		return apartment;
		
	}


	public boolean equals(Student s)
	{
		return false;
		
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



















	



}


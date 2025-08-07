package Pack1;

public class Person2 {
	private String firstName;
	private String LastName;
	private char gender;
	private String phoneNumber;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Person2() {
		super();
	}
	public Person2(String firstName, String lastName, char gender, String phoneNumber) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void displayDetails() {
		System.out.println("Personal Details");
		System.out.println("__________________");
		System.out.println("First Name :"+firstName);
		System.out.println("Last Name : "+LastName);
		System.out.println("Gender :"+gender);
		System.out.println("Mobile Number: "+phoneNumber);
	}
	

}

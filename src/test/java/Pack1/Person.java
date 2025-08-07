package Pack1;

public class Person {
	private String firstName;
	private String LastName;
	private char gender;
	public Person() {
		super();
	}
	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;
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
	

}

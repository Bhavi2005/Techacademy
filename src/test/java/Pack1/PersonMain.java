package Pack1;

public class PersonMain {

	public static void main(String[] args) {
		Person p=new Person("Bhavitha","Kamatham",'F');
		System.out.println("Personal Details");
		System.out.println("__________________");
		System.out.println("First Name :"+p.getFirstName());
		System.out.println("Last Name : "+p.getLastName());
		System.out.println("Gender :"+p.getGender());
	}

}

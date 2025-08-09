package Pac3;

class NameBlankException extends Exception {
	 public NameBlankException(String message) {
	     super(message);
	 }
	}

	public class Lab3_1 {
	 public static void main(String[] args) {
	     String firstName = "BHAVITHA";
	     String lastName = "KAMATHAM";

	     try {
	         validateName(firstName, lastName);
	         System.out.println("Employee name is valid: " + firstName + " " + lastName);
	     }
	     catch (NameBlankException e)
	     {
	         System.out.println("Error: " + e.getMessage());
	     }
	 }

	 public static void validateName(String firstName, String lastName) throws NameBlankException
	 {
	     if (firstName.isEmpty() || lastName.isEmpty())
	     {
	         throw new NameBlankException("First name or last name cannot be blank.");
	     }
	 }
	}

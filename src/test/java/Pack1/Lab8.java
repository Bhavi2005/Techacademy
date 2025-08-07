package Pack1;

import java.util.Scanner;

public class Lab8
{

   
    enum Gender {
        MALE,
        FEMALE
    }

  
    static class Person {
        private String firstName;
        private String lastName;
        private Gender gender;
        private String phoneNumber;

      
     
        public Person() {
			super();
		}


		public Person(String firstName, String lastName, Gender gender, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
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
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Gender getGender() {
            return gender;
        }
        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

      
        public void displayDetails() {
            System.out.println("\n----- Person Details -----");
            System.out.println("First Name  : " + firstName);
            System.out.println("Last Name   : " + lastName);
            System.out.println("Gender      : " + gender);
            System.out.println("Phone Number: " + phoneNumber);
        }
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Gender (M/F): ");
        String genderInput = sc.next().toUpperCase();

        Gender gender;

        if (genderInput.equals("M")) {
            gender = Gender.MALE;
        } else if (genderInput.equals("F")) {
            gender = Gender.FEMALE;
        } else {
            System.out.println("Invalid input. Gender must be 'M' or 'F'.");
            sc.close();
            return;
        }

        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.next();

        // Create object and display details
        Person person = new Person(firstName, lastName, gender, phoneNumber);
        person.displayDetails();

        sc.close();
    }
}
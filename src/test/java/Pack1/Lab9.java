package Pack1;

import java.util.Scanner;

public class Lab9{

    
    public static String performOperation(String input, int choice) {
    	String res="";
        switch (choice) {
            case 1:
              
                return input + input;

            case 2:
               
            	for(int i=0;i<input.length();i++) {
            		if(i%2==0) {
            			res+=input.charAt(i);
            			
            		}else {
            			res+="#";
            		}
            		return res;
            	}
            	
            case 3:
                
                StringBuilder noDuplicates = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (noDuplicates.indexOf(String.valueOf(c)) == -1) {
                        noDuplicates.append(c);
                    }
                }
                return noDuplicates.toString();

            case 4:
           
                StringBuilder oddUpper = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (i % 2 != 0) {
                        oddUpper.append(Character.toUpperCase(c));
                    } else {
                        oddUpper.append(c);
                    }
                }
                return oddUpper.toString();

            default:
                return "Invalid choice!";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Choose an operation:");
        System.out.println("1. Add the string to itself");
        System.out.println("2. Replace odd positions with '#'");
        System.out.println("3. Remove duplicate characters");
        System.out.println("4. Change odd characters to upper case");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        
        String result = performOperation(input, choice);
        System.out.println("Result: " + result);

        sc.close();
    }
}

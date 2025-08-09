package Pac3;

class AgeInvalidException extends Exception 
{
 public AgeInvalidException(String message) 
 {
     super(message);
 }
}

public class Lab3_2 {
 public static void main(String[] args) 
 {
     int age = 23;

     try {
         validateAge(age);
         System.out.println("Age is valid: " + age);
     } 
     catch (AgeInvalidException e)
     {
         System.out.println("Error: " + e.getMessage());
     }
 }

 public static void validateAge(int age) throws AgeInvalidException 
 {
     if (age <= 15) 
     {
         throw new AgeInvalidException("Age must be greater than 15.");
     }
 }
}
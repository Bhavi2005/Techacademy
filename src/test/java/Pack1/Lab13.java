package Pack1;

import java.time.LocalDate;
import java.util.Scanner;

	public class Lab13 {

	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);

	        System.out.print("Enter a product purchase date in format of YYYY-MM-DD: ");
	        String purchasedate = sc.nextLine();
	        LocalDate date = LocalDate.parse(purchasedate);
	        System.out.print("Enter the warranted years and months");
	        int years=sc.nextInt();
	        int months=sc.nextInt();
	        
	       LocalDate expiryDate=date.plusYears(years).plusMonths(months);
	       
	 
	        System.out.println("The Product Warranty will expires on : " +expiryDate);

	    
	    }
	}
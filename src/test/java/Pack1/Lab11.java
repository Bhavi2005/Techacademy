package Pack1;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Lab11 {
		    public static void main(String[] args){
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter date in yyyy-MM-dd format:");
		        String inputDateStr = scanner.nextLine();
		        scanner.close();

		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		        try {
		            LocalDate inputDate = LocalDate.parse(inputDateStr, formatter);
		            LocalDate currentDate = LocalDate.now();
		            Period period = Period.between(inputDate, currentDate);

		            System.out.println("Duration between " + inputDate + " and current system date (" + currentDate + ") is:");
		            System.out.println("Years: " + Math.abs(period.getYears()));
		            System.out.println("Months: " + Math.abs(period.getMonths()));
		            System.out.println("Days: " + Math.abs(period.getDays()));
		        } catch (DateTimeParseException e) {
		            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
		        }
		    }
		}
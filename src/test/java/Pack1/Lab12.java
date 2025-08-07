package Pack1;



	
	import java.time.LocalDate;
	import java.time.Period;
	import java.util.Scanner;

	public class Lab12 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two dates in yyyy-MM-dd format:");
	        LocalDate date1 = LocalDate.parse(scanner.nextLine());
	        LocalDate date2 = LocalDate.parse(scanner.nextLine());
	        scanner.close();
	        Period period = Period.between(date1, date2);
	        System.out.println("Duration: " + Math.abs(period.getYears()) + " years, " + Math.abs(period.getMonths()) + " months, " + Math.abs(period.getDays()) + " days");
	    }
	}

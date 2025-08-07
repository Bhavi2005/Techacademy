package Pack1;



	import java.time.ZonedDateTime;
	import java.time.ZoneId;
	import java.time.format.DateTimeFormatter;

	
	public class Lab14 {
	    public static void TimeZone(String country) {
	        try {
	            ZoneId obj1 = ZoneId.of(country);
	            ZonedDateTime obj2 = ZonedDateTime.now(obj1);
	            DateTimeFormatter obj3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

	            System.out.println("Current Date and Time in " + country + ": " + obj2.format(obj3));
	        } catch (Exception e) {
	            System.out.println("Invalid Zone ID: " + country);
	        }
	    }

	    public static void main(String[] args) {
	        TimeZone("America/New_York");
	        TimeZone("Asia/Kolkata");  
	    }
	}

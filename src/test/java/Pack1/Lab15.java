package Pack1;



	import java.time.LocalDate;
	import java.time.Period;
	public class Lab15 {

		public void calculateAge(String DOB)
		{
			LocalDate date_of_birth=LocalDate.parse(DOB);
			LocalDate currentdate=LocalDate.now();
			Period age=Period.between(date_of_birth,currentdate) ;
			System.out.println("The age of person is "+age.getYears());
		}
		
		public void getFullName(String firstName,String lastName)
		{
			
			System.out.println("Full name is:"+firstName+" "+lastName);
		}
		
		public static void main(String[] args) 
		{
			Lab15 obj=new Lab15();
			System.out.println("PERSON DETAILS");
			System.out.println("________________");
			
			obj.getFullName("Bhavitha","Kamatham");
			obj.calculateAge("2003-05-20");
			
		}

	}

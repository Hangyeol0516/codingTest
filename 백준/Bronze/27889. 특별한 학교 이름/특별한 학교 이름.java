import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
				
			String name = scan.next();
			
			if (name.equals("NLCS")) {
				System.out.println("North London Collegiate School");
				
			} else if (name.equals("BHA")) {
				System.out.println("Branksome Hall Asia");
				
			}else if (name.equals("KIS")) {
				System.out.println("Korea International School");
				
			}else if (name.equals("SJA")) {
				System.out.println("St. Johnsbury Academy");
			}
	}
	
}
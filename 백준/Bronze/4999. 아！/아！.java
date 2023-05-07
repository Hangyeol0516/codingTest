import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		String a = scan.next();
		String b = scan.next();
		
		if (a.length() >= b.length()) {
			System.out.println("go"); 
		} else if (a.length() <= b.length()) {
			System.out.println("no");
		}
	}
}

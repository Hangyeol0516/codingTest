import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
				
			String name = scan.next();
			
			if (name.equals("A+")) {
				System.out.println("4.3");
			} else if (name.equals("A0")) {
				System.out.println("4.0");
			} else if (name.equals("A-")) {
				System.out.println("3.7");
			} else if (name.equals("B+")) {
				System.out.println("3.3");
			} else if (name.equals("B0")) {
				System.out.println("3.0");
			} else if (name.equals("B-")) {
				System.out.println("2.7");
			} else if (name.equals("C+")) {
				System.out.println("2.3");
			} else if (name.equals("C0")) {
				System.out.println("2.0");
			} else if (name.equals("C-")) {
				System.out.println("1.7");
			} else if (name.equals("D+")) {
				System.out.println("1.3");
			} else if (name.equals("D0")) {
				System.out.println("1.0");
			} else if (name.equals("D-")) {
				System.out.println("0.7");
			} else if (name.equals("F")) {
				System.out.println("0.0");
			}
			
	}
	
}
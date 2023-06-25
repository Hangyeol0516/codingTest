import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int M = a * b;
		int P = c * d;
		
		if (M>P) {
			System.out.print("M");
		} else if (M<P) {
			System.out.print("P");
		} else {
			System.out.print("E");
		}
		
	}
	
}
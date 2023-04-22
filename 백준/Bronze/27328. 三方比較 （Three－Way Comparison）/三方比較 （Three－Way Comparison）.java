import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if (A<B) {
			System.out.println("-1");
		} else if (A==B) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}				
		
	}
	
}
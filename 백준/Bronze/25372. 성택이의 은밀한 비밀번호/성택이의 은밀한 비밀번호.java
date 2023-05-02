import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );

		int N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			String a  = scan.next();
			
			if (a.length()>9 ||a.length()<6) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
	}
	
}
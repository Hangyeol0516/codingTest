import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int U = scan.nextInt();
		int L = scan.nextInt();
		
		if (N >= 1000) {
			if (U >= 8000 || L >= 260) {
				System.out.println("Very Good");
			} else {
				System.out.println("Good");
			}
		} else {
			System.out.println("Bad");
		}

	}

}
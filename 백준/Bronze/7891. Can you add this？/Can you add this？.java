import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for (int i = 1; i <= t; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			System.out.println(x+y);
		}

	}

}
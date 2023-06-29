import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			String str = scan.next();
			sum += str.length();
		}
		System.out.println(sum);
	}
}
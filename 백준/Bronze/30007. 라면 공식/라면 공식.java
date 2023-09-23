import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int X = scan.nextInt();
			
			System.out.println(A*(X-1)+B);
		}
		
	}

}
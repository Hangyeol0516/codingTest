import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		if ((100*N) >= M) {
			System.out.println("Yes");
		} else if ((100*N) < M) {
			System.out.println("No");
		}
				
	}
	
}
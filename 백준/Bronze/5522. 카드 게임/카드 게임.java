import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		int result = 0;
		
		for (int i = 1; i <= 5; i++) {
			int A = scan.nextInt();
			result = result + A;
		}
		System.out.println(result);
	}
	
}
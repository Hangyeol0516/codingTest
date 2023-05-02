import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );

			int a = scan.nextInt();
			int result = 0;
			
			for (int i = 1; i <= 5; i++) {
				int b = scan.nextInt();
				if (a==b) {
					result++;
				}
			}
			System.out.println(result);
	}
	
}
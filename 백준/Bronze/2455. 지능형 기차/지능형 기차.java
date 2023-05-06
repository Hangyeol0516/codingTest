import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int index = 0;
		int result = 0;
		
		for (int i=1; i<=4; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			index = index + b - a;
			if (index > result ) {
				result = index;
			}
		}
		System.out.println(result);	
	}
}

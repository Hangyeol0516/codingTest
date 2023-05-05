import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int result = 0;
		int index = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			int a = scan.nextInt();
			result += a;
		}
		System.out.println(index-result);
        
	}
}

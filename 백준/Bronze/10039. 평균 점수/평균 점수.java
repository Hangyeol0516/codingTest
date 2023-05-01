import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		int result =0;
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			sum  = scan.nextInt();
			if (sum < 40) {
				result = 40 + result;
			}else {
				result = sum + result;
			}
		}
		System.out.println(result/5);
	}
	
}
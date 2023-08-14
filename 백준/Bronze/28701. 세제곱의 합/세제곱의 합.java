import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int result = 0;
		
		for (int i = 1; i <= N; i++) {
			result += i;
		}
		System.out.println(result);
		
		result *= result;
		System.out.println(result);
		
		result = 0;
		for (int i = 1; i <= N; i++) {
			int j = i;
			result += j * j * j;
		}
		System.out.println(result);
	}

}
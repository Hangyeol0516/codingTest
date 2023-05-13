import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		
		while (true) {
			int sum = scan.nextInt();
			
			if (sum == -1) {
				break;
			} else if (sum != -1) {
				result +=sum;
			}
		}
		System.out.println(result);
	}

}
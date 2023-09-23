import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int result = 0;
		
		for (int i = 1; i <= N; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if (x == 136) result += 1000;
			if (x == 142) result += 5000;
			if (x == 148) result += 10000;
			if (x == 154) result += 50000;
		}
		System.out.println(result);
	}

}
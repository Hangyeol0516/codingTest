import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int result = 0;
        
        for (int i = 1; i <= T; i++) {
        	int N = scan.nextInt();
			for (int j = 1; j <= N; j++) {
				int num = scan.nextInt();
				result += num;
			}
			System.out.println(result);
			result = 0;
		}
 
    }
}
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int result = 0;
        
        for (int i = 1; i <= T; i++) {
			int s = scan.nextInt();
			result += s;
			int n = scan.nextInt();
			for (int j = 1; j <= n; j++) {
				int q = scan.nextInt();
				int p = scan.nextInt();
				
				result += q * p;
			}
			System.out.println(result);
			result = 0;
		}
 
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        int result = 0;
        
        for (int i = 1; i <= N; i++) {
			int H = scan.nextInt();
			int B = scan.nextInt();
			int K = scan.nextInt();
			
			if (H < B) {
				result += (B - H) * K; 
			}
		}
        System.out.println(result);
    }
}
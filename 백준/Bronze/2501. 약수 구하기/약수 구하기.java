import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int min = 0;
		
		for (int i = 1; i <= N; i++) {
			
			if(N%i==0) {
				min++;
			}
			
			if(min == K) {
				System.out.print(i);
				break;
			}
		}
		if(min < K) {
			System.out.println("0");
		}
		
	}
}
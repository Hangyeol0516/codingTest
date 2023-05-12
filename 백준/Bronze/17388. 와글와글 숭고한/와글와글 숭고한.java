import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int S = scan.nextInt();
		int K = scan.nextInt();
		int H = scan.nextInt();
		
		int min = Math.min(S, Math.min(K, H));
		
		if (S+K+H >= 100) {
			System.out.println("OK");
		} else if (min == S) {
			System.out.println("Soongsil");
		} else if (min == K) {
			System.out.println("Korea");
		} else if (min == H) {
			System.out.println("Hanyang");
		}
		
	}

}
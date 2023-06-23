import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int result = 0;
		
		if (N >= A) {
			result += A;
		}
		if (N >= B) {
			result += B;
		}
		if (N >= C) {
			result += C;
		}
		
		if (N < A) {
			result += N;
		}
		if (N < B) {
			result += N;
		}
		if (N < C) {
			result += N;
		}
		
		System.out.println(result);
	}

}
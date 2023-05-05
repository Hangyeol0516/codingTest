import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int S = 0;
		int T = 0;
		
		for (int i=1; i <= 4; i++) {
			int score = scan.nextInt();
			S += score;
		}
		for (int i=1; i <= 4; i++) {
			int score = scan.nextInt();
			T += score;
		}
		if (S>T || S==T) {
			System.out.println(S);
		} else if (S<T) {
			System.out.println(T);
		}
		
	}
}

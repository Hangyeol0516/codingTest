import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
			
			if(i%6==0) {
				System.out.print("Go! ");
			}
		}
		
		if(N%6!=0) {
			System.out.print("Go!");
		}
		
	}
}
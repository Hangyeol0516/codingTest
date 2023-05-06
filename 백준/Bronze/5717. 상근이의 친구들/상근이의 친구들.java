import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		for (;true;) {
			int M = scan.nextInt();
			int N = scan.nextInt();
			
			if (M==0 && N==0) {
				break;
			}
			System.out.println(M+N);
		}
		
	}
}

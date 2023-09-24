import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			int c = scan.nextInt();
			
			if (c==1) {
				result += 1;
			} else if (c==-1) {
				result -= 1;
			}
		}
		if (result > 0) {
			System.out.println("Right");
		} else if (result < 0) {
			System.out.println("Left");
		} else {
			System.out.println("Stay");
		}
	}

}
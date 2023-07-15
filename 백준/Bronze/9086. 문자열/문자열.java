import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();

		for (int i = 1; i <= T; i++) {
			String str = scan.next();
            
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length()-1));	
		}
	}
}
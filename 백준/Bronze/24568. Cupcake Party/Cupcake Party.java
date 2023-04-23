import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
			int R = scan.nextInt();
			int S = scan.nextInt();
			
			System.out.println((R*8)+(S*3)-28);
	}
	
}
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		for (int i=1; i<=3; i++) {
			
			int yutjjak1 = scan.nextInt();
			int yutjjak2 = scan.nextInt();
			int yutjjak3 = scan.nextInt();
			int yutjjak4 = scan.nextInt();
			
			if (yutjjak1 + yutjjak2 + yutjjak3 + yutjjak4 == 4) {
				System.out.println("E");
			} 
			else if (yutjjak1 + yutjjak2 + yutjjak3 + yutjjak4 == 3) {
				System.out.println("A");
			} 
			else if (yutjjak1 + yutjjak2 + yutjjak3 + yutjjak4 == 2) {
				System.out.println("B");
			} 
			else if (yutjjak1 + yutjjak2 + yutjjak3 + yutjjak4 == 1) {
				System.out.println("C");
			} 
			else if (yutjjak1 + yutjjak2 + yutjjak3 + yutjjak4 == 0) {
				System.out.println("D");
			} 
			
		}
        
	}
}

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );

		while (true) {
			String a = scan.next();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if (b > 17 || c >= 80) {
				System.out.println(a +" Senior");
			} else if (b == 0 && c ==0) {
				break;
			} else {
				System.out.println(a +" Junior");
			}
		}	
	}
    
}
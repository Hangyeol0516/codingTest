import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		int a  = scan.nextInt();
		int b  = scan.nextInt();
		int c  = scan.nextInt();
		int d  = scan.nextInt();
		int e  = scan.nextInt();
		
		int min1 = Math.min(Math.min(a,b),c);
		int min2 = Math.min(d,e);
		
		int result = min1 + min2 - 50;
				
		System.out.println(result);
	}
	
}
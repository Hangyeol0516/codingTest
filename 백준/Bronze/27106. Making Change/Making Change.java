import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int P = scan.nextInt();
		
		P = 100 - P;
		
		int a = P / 25;
		P -= (P / 25) * 25;
		
		int b = P / 10;
		P -= (P / 10) * 10;
		
		int c = P / 5;
		P -= (P / 5) * 5;
		
		int d = P / 1;
		P -= (P / 1) * 1;
		
		System.out.print(a+" "+b+" "+c+" "+d);
		
	}
	
}
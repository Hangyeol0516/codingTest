import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
 
		int UR = scan.nextInt() * 56;
		int TR = scan.nextInt() * 24;
		int UO = scan.nextInt() * 14;
		int TO = scan.nextInt() * 6;
		
		int result = UR + TR + UO + TO;
		
		System.out.println(result);
	}
}
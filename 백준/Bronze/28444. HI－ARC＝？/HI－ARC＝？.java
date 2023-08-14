import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int I = scan.nextInt();
		
		int result1 = H * I;
		
		int A = scan.nextInt();
		int R = scan.nextInt();
		int C = scan.nextInt();
		
		int result2 = A * R * C;
	
		System.out.println(result1 - result2);
		
	}

}
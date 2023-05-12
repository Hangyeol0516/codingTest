import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		double b = scan.nextInt();
		double c = scan.nextInt();
		
		double result1 = 0;
		double result2 = 0;
		
		result1 = a*b/c;
		result2 = a/b*c;
		
		System.out.println((int)Math.max(result1, result2));
		
	}

}
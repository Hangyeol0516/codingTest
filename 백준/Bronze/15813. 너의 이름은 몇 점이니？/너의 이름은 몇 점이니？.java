import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
 
		int n = scan.nextInt();
		int result = 0;
		
		String str = scan.next();
		
		for (int j = 0; j < n; j++) {	
			result += (str.charAt(j)-1) - 63;
		}
		System.out.println(result);
		
	}
}
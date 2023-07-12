import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		
		int P = scan.nextInt();
		
		for (int i = 1; i <= P; i++) {
			
			int G = scan.nextInt();
			int C = scan.nextInt();
			int N = scan.nextInt();
			
			if (G==1) {
				result4++;
				continue;
			}
			
			if (C==1 || C==2) result1++;
			if (C==3) result2++;
			if (C==4) result3++;
		}
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
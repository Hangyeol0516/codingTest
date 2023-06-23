import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int a3 = scan.nextInt();
		int a4 = scan.nextInt();
		
		int b = scan.nextInt();
		
		int min = Math.min(a1,Math.min(a2,Math.min(a3,a4)));
		
		if(a1 == a2 && a2 == a3 && a3 == a4 && a4 == a1) {
			System.out.println(1);
		} else if (a1 + b == a2 && a2 == a3 && a3 == a4 && a4 == a1 + b) {
			System.out.println(1);
		} else if (a1 == a2 + b && a2 + b == a3 && a3 == a4 && a4 == a1) {
			System.out.println(1);
		} else if (a1 == a2 && a2 == a3 + b  && a3 + b  == a4 && a4 == a1) {
			System.out.println(1);
		} else if (a1 == a2 && a2 == a3 && a3 == a4 + b  && a4 + b  == a1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
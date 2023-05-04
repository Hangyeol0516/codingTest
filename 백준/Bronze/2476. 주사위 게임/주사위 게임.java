import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int N = scan.nextInt();
		int result = 0;
		int money = 0;
		
		for (int i = 1; i <= N; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			money = 0;
			
			if (a==b && b==c) {
				money = 10000 + a * 1000;
			} else if (a==b || b==c || a==c) {
				if (a==b) {
					money = 1000 + a * 100;
				} else if (b==c) {
					money = 1000 + b * 100;
				} else if (c==a) {
					money = 1000 + c * 100;
				}
			} else if (a!=b || b!=c || a!=c) {
				money = Math.max(a, Math.max(b, c)) * 100;
			}
			
			if(money > result) {
				result = money;
			}
			
		}
		System.out.println(result);
		
	}
}
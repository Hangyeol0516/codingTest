import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int n = scan.nextInt();
		
		int max;
		int mid;
		int min;
		
		for (int i=1; i<=n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			max = Math.max(a,Math.max(b,c));
			min = Math.min(a,Math.min(b,c));
			
			if(a>=b) {
				if(b>=c) {
					mid = b;
				}else if(c<=a) {
					mid = c;
				}else {
					mid = a;
				}	
			}else if(a>c) {
				mid = a;
			}else if(b>c) {
				mid = c;
			}else {
				mid = b;
			}
			
			System.out.println("Scenario #" + i + ":");
			
			if ((min*min) + (mid*mid) == (max*max)) {
				System.out.println("yes");
			} else if ((min*min) + (mid*mid) != (max*max)) {
				System.out.println("no");
			}
			System.out.println();
		}
		
	}
}

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int a,b,c;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
	
		a = a + c/60;
		b = b + c%60;
		
		if(b>=60) {
			b = b - 60;
			a = a + 1;
			
		}
		
		if(a>=24) {
			a = a - 24;
		}
		System.out.println(a + " " + b);
	}
	
}

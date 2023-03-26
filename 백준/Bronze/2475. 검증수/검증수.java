import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int a,b,c,d,e;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		e = scan.nextInt();
			
		int n = (a*a)+(b*b)+(c*c)+(d*d)+(e*e);
		
		System.out.println(n%10);
		
		
			
	}
	
}
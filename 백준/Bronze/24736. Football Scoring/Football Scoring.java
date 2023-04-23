import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
			int T = scan.nextInt();
			int F = scan.nextInt();
			int S = scan.nextInt();
			int P = scan.nextInt();
			int C = scan.nextInt();
			
			T = T*6;
			F = F*3;
			S = S*2;
			P = P*1;
			C = C*2;
			
			int away = T+F+S+P+C;
			
			int t = scan.nextInt();
			int f = scan.nextInt();
			int s = scan.nextInt();
			int p = scan.nextInt();
			int c = scan.nextInt();
			
			t = t*6;
			f = f*3;
			s = s*2;
			p = p*1;
			c = c*2;
		
			int home = t+f+s+p+c;
					
			System.out.println(away+" "+home);
	}
	
}
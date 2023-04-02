import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int n = scan.nextInt();
		
		int cnt = 0;
		
		int[] a = new int[n];
		
		for(int i=0; i<n ; i=i+1) {
			
			a[i] = scan.nextInt();
				
		}
		int b = scan.nextInt();
		
		for(int i=0; i<n ; i=i+1) {
			if(a[i] == b) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
		
	}
	
}

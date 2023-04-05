import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n ; i=i+1) {
			a[i] = scan.nextInt();
				if(a[i] < x) {
					System.out.print(a[i]+" ");
			}	
		}
	}
}

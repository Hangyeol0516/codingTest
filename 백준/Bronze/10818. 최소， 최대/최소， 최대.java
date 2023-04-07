import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n ; i=i+1) {
			a[i] = scan.nextInt();
		}
		
		Arrays.sort(a);
		System.out.print(a[0]+" "+a[n-1]);
		
	}
}

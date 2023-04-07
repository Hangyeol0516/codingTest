import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int[] a = new int[9];
		int max = 0;
		int order = 0;
		
		for(int i=0; i<9 ; i=i+1) {
			a[i] = scan.nextInt();
			
			if(a[i] > max) {
				max = a[i];
				order = i + 1;
			}
		}
		System.out.println(max+" "+order);
	}
}

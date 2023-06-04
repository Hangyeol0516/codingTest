import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int[] arr = new int[100];
		
		for (int i = 1; i <= 28; i++) {
			arr[scan.nextInt()]++;
		}
		
		for (int i = 1; i <= 30; i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
		
	}
}
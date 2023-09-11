import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int arr[] = new int[N];
		
		int sum = 0;
		int result = 0;

		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					
					sum = arr[i] + arr[j] + arr[k];
					
					if(sum <= M && sum > result) {
						result = sum;
					}
				}
			}
		}
		System.out.println(result);
	}
}
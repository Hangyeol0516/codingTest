import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int cnt = 0;
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		while(cnt < M) {
			int i = (scan.nextInt()-1);
			int j = (scan.nextInt()-1);
			
			while(j>i) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
				i++;
			}
			cnt++;
		}
		for(int i=0; i<N ;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double sum = 0;
				
		double[] arr = new double[N];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = scan.nextDouble();
		}
		
		Arrays.sort(arr);
		
		double M = arr[N-1];
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / M)*100);
		}
		System.out.println(sum / N);
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int result = 0;
		int min;
		int cnt = 0;
		
		int arr[] = new int[7];
		
		for (int i = 0; i < arr.length; i++) {
			int n = scan.nextInt();
			if(n%2!=0) {
				result += n;
				arr[i] = n;
			}else {
				cnt++;
			}
		}
		if(result <= 0) {
			System.out.print("-1");
		} else {			
			Arrays.sort(arr);
			System.out.println(result);
			System.out.println(arr[cnt]);
		}
	}
    
}
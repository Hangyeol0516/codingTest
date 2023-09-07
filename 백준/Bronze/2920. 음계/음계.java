import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[8];
		
		int result1 = 0;
		int result2 = 0;
		
		for (int i = 0; i < 8; i++) {
			int n = scan.nextInt();
			arr[i] = n; 
		}
		
		for (int i = 0; i < 8; i++) {
			if (arr[i] == i+1) {
				result1 += 1;
			}
			else if (arr[i] == 8-i) {
				result2 += 1;
			}
		}
		
		if (result1 == 8) {
			System.out.println("ascending");
		} else if (result2 == 8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
        
	}
}
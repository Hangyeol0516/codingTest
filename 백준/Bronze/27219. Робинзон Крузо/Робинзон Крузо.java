import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for (int i = 1; i <= n/5; i++) {
			System.out.print("V");
		}
        
        for (int i = 1; i <= n%5; i++) {
			System.out.print("I");
		}
        
    }
}
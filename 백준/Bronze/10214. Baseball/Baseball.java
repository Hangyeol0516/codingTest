import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        int Yonsei = 0;
        int Korea = 0;
        
        for (int i = 1; i <= N; i++) {
        	for (int j = 1; j <= 9; j++) {
				int Y = scan.nextInt();
				int K = scan.nextInt();
				
				Yonsei += Y;
				Korea += K;
			}
        	if(Yonsei > Korea) {
        		System.out.println("Yonsei");
        	} else if(Yonsei < Korea) {
        		System.out.println("Korea");
        	} else {
        		System.out.println("Draw");
        	}
        }
        
    }
}

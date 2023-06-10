import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for (int i = 1; i <= N; i++) {
        	int x = scan.nextInt();
        	
        	if(x%2==0) {
        		System.out.println(x + " is even");
        	} else {
        		System.out.println(x + " is odd");
        	}
		}
     
    }
}
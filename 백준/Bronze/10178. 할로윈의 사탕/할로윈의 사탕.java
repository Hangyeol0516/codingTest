import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        
        for (int i = 1; i <= T; i++) {
        	int c = scan.nextInt();
        	int v = scan.nextInt();
        	
        	int a = c/v;
        	int b = c%v;
        	
        	System.out.println("You get "+ a +" piece(s) and your dad gets "+ b +" piece(s).");
		}
 
    }
}
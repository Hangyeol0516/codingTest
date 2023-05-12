import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
        
    	int result1 = 100;
    	int result2 = 100;
    	
        int n = scan.nextInt();
         
         for (int i = 1; i <= n; i++) {
        	 int a = scan.nextInt();
        	 int b = scan.nextInt();
        	 
        	 if (a>b) {
				result2 -= a;
			} else if (a<b) {
				result1 -= b;
			}
		}
        System.out.println(result1);
        System.out.println(result2);
    }
}
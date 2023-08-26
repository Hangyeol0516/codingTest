import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    
    	Scanner scan = new Scanner(System.in);
    	
    	int N = scan.nextInt();
    	
    	for (int i = 1; i <= N; i++) {
    		
    		int M = scan.nextInt();
    		
    		if (M>=300) {
    			System.out.print("1 ");
    		} else if (M>=275) {
    			System.out.print("2 ");
    		} else if (M>=250) {
    			System.out.print("3 ");
    		} else {
    			System.out.print("4 ");
    		}
    		
		}

    }
}
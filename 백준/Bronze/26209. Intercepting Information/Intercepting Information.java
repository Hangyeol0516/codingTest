import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    
    	Scanner scan = new Scanner(System.in);
    	
    	int F = 0;
    	
    	for (int i = 1; i <= 8; i++) {
    		
    		int N = scan.nextInt();
    		
    		if (N!=1) {
    			if (N!=0) {
    				F++;
    			}
    		}
    		
		}
    	
    	if (F==0) {
			System.out.println("S");
		} else {
			System.out.println("F");
		}

    }
}
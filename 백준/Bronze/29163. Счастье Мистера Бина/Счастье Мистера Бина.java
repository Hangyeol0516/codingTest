import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	
    	int Happy = 0;
    	int Sad = 0;
    	
    	for (int i = 1; i <= n; i++) {
    		
    		int a = scan.nextInt();
    		
    		if (a%2==0) {
				Happy++;
			} else {
				Sad++;
			}
    		
		}
    	
    	if (Happy > Sad) {
			System.out.println("Happy");
		} else {
			System.out.println("Sad");
		}

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int Tiger = 0;
        int Lion = 0;
        
        for (int i = 1; i <= 9; i++) {
        	String str = scan.next();
        	
        	if(str.equals("Tiger")) {
        		Tiger++;
        	}
        	if(str.equals("Lion")) {
        		Lion++;
        	}
		}
        if (Tiger > Lion) {
			System.out.println("Tiger");
		} else {
			System.out.println("Lion");
		}
        
    }
}
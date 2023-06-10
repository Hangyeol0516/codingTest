import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;
        int Q4 = 0;
        
        int AXIS = 0;
        
        for (int i = 1; i <= N; i++) {
        	int x = scan.nextInt();
        	int y = scan.nextInt();
        	
        	if(x == 0 || y == 0) {
        		AXIS++;
        	} else if(x>0 && y>0) {
        		Q1++;
        	} else if(x<0 && y<0) {
        		Q3++;
        	} else if(x>0 && y<0) {
        		Q4++;
        	} else {
        		Q2++;
        	}
        		
		}
        System.out.println("Q1: " + Q1);
        System.out.println("Q2: " + Q2);
        System.out.println("Q3: " + Q3);
        System.out.println("Q4: " + Q4);
        System.out.println("AXIS: " + AXIS);
     
    }
}
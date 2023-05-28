import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        int c = scan.nextInt(); 
        int[] student;
        
        for (int i=0; i<c; i++) {
        	
        	int n = scan.nextInt();
        	student = new int[n];
        	
        	int result = 0;
 
        	for (int j=0; j<n; j++) {
        		
        		int score = scan.nextInt();
        		student[j] = score;
        		result += score;
        	}
        	   	
        	double averge = result/n;
        	double count = 0;
        	
        	for (int k=0; k<n; k++) {
        		if (student[k] > averge)
        			count++;
        	}	
        	System.out.printf("%.3f%%\n", count / n * 100);
        }
	}
}
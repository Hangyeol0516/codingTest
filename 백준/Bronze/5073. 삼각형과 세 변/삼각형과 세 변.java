import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
        	int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            
            int max = Math.max(A, Math.max(B, C));
            int min = Math.min(A, Math.min(B, C));
            int mid;
            
            if(A>=B) {
    			if(B>=C) {
    				mid = B;
    			}else if(C<=A) {
    				mid = C;
    			}else {
    				mid = A;
    			}	
    		}else if(A>C) {
    			mid = A;
    		}else if(B>C) {
    			mid = C;
    		}else {
    			mid = B;
    		}
            
            if (A==0 || B==0 || C==0) {
            	break;
            }
            
            if (max >= mid + min) {
            	System.out.println("Invalid");
            } else if (A == B && B == C && C==A) {
            	System.out.println("Equilateral");
            } else if (A==B || B==C || C==A) {
            	System.out.println("Isosceles");
            } else if (A != B || B != C || C!=A) {
            	System.out.println("Scalene");
            }
            
		}
        
    }
}
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        int max;
        int mid;
        int min;
        
        max = Math.max(A, Math.max(B, C));
        
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
       
        min = Math.min(A, Math.min(B, C));
        
        System.out.println(min+" "+mid+" "+max);
        
    }
}
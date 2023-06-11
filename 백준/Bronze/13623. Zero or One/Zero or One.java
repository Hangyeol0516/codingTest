import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        if(A==1 && B==1 && C==1) System.out.println("*");
        if(A==0 && B==0 && C==0) System.out.println("*");
        
        if(A==1 && B==0 && C==0) System.out.println("A");
        if(A==0 && B==1 && C==1) System.out.println("A");
        
        if(A==0 && B==1 && C==0) System.out.println("B");
        if(A==1 && B==0 && C==1) System.out.println("B");
        
        if(A==0 && B==0 && C==1) System.out.println("C");
        if(A==1 && B==1 && C==0) System.out.println("C");
    }
}
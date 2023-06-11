import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        
        int N = scan.nextInt();
        
        a = N%10;
        b = N/10;
        
        if(a==b) System.out.println("1");
        if(a!=b) System.out.println("0");
    }
}
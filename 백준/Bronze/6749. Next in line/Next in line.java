import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int Y = scan.nextInt();
        int M = scan.nextInt();
        
        int result = M - Y;
        
        System.out.println(M+result);
        
    }
}
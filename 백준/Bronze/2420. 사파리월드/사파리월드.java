import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long N = scan.nextInt();
        long M = scan.nextInt();
	
        long max = Math.max(N, M);
        long min = Math.min(N, M);
        
        System.out.println(max-min);
        
    }
}
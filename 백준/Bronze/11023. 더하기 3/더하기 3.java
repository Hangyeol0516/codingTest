import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result = 0;
        
        while (scan.hasNextInt()) {
        	int n = scan.nextInt();
        	result += n;
        }
        System.out.println(result);

    }
}
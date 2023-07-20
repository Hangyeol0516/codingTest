import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int result = 0;
        
        while(true) {
        	String N1 = scan.nextLine();

        	if (N1.equals("0")) break;
        	result++;
        	System.out.println("Case " + result + ": Sorting... done!");
        }
    }
}
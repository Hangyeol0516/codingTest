import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        while (true) {
        	int a = scan.nextInt();
			if (a == 0) {
				break;
			} else if (a%n==0) {
				System.out.println(a +" is a multiple of " + n + ".");
			} else if (a%n!=0) {
				System.out.println(a +" is NOT a multiple of " + n + ".");
			}
		}
				
    }
}
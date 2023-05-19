import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        
        int result1 = 0;
        int result2 = 0;
    
        for (int i = 1; i <= T; i++) {
			int a1 = scan.nextInt();
			int a2 = scan.nextInt();
			int a3 = scan.nextInt();
			int a4 = scan.nextInt();
			int a5 = scan.nextInt();
			int a6 = scan.nextInt();
			
			int b1 = scan.nextInt();
			int b2 = scan.nextInt();
			int b3 = scan.nextInt();
			int b4 = scan.nextInt();
			int b5 = scan.nextInt();
			int b6 = scan.nextInt();
			int b7 = scan.nextInt();
			
			result1 = (a1*1) + (a2*2) + (a3*3) + (a4*3) + (a5*4) + (a6*10);
			result2 = (b1*1) + (b2*2) + (b3*2) + (b4*2) + (b5*3) + (b6*5) + (b7*10);
			
			if (result1 > result2) {
				System.out.println("Battle "+i+": Good triumphs over Evil");
			} else if (result1 <result2) {
				System.out.println("Battle "+i+": Evil eradicates all trace of Good");
			} else {
				System.out.println("Battle "+i+": No victor on this battle field");
			}
		}
			
    }
}
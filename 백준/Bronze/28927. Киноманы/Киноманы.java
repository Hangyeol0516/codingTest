import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		int MaxA = scan.nextInt();
		int MaxB = scan.nextInt();
		int MaxC = scan.nextInt();
		
		int resultMax = (MaxA*3) + (MaxB*20) + (MaxC*120);
		
		int MelA = scan.nextInt();
		int MelB = scan.nextInt();
		int MelC = scan.nextInt();
		
		int resultMel = (MelA*3) + (MelB*20) + (MelC*120);
		
		if (resultMax > resultMel) {
			System.out.println("Max");
		} else if (resultMax < resultMel) {
			System.out.println("Mel");
		} else {
			System.out.println("Draw");
		}

	}

}
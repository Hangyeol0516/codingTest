import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if (a>=620) {
			System.out.println("Red");
		} else if (a>=590) {
			System.out.println("Orange");
		} else if (a>=570) {
			System.out.println("Yellow");
		} else if (a>=495) {
			System.out.println("Green");
		} else if (a>=450) {
			System.out.println("Blue");
		} else if (a>=425) {
			System.out.println("Indigo");
		} else if (a>=380) {
			System.out.println("Violet");
		}

	}

}
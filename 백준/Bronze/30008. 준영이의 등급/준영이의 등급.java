import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		for (int i = 1; i <= K; i++) {
			int G = scan.nextInt();
			
			if (0<=G*100/N && G*100/N<=4) System.out.print("1 ");
			if (4<G*100/N && G*100/N<=11) System.out.print("2 ");
			if (11<G*100/N && G*100/N<=23) System.out.print("3 ");
			if (23<G*100/N && G*100/N<=40) System.out.print("4 ");
			if (40<G*100/N && G*100/N<=60) System.out.print("5 ");
			if (60<G*100/N && G*100/N<=77) System.out.print("6 ");
			if (77<G*100/N && G*100/N<=89) System.out.print("7 ");
			if (89<G*100/N && G*100/N<=96) System.out.print("8 ");
			if (96<G*100/N && G*100/N<=100) System.out.print("9 ");
		}
		
	}

}
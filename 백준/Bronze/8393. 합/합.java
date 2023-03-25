import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int a;
		
		a = scan.nextInt();
		int b = 0;
		
	      for(int i=1; i<=a; i++) {
	    	  b = b + i; 
	      }
	      System.out.println(b);
	    	 
	}
	
}
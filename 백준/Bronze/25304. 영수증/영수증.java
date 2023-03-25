import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int x,n,a,b;
		
		x = scan.nextInt();
		n = scan.nextInt();
		
	      for(int i=0; i< n; i++) {
	    	  a = scan.nextInt();
	    	  b = scan.nextInt();
	    	  
	    	  x = x - (a*b);
	    	  
	      }
	      if(x==0) {
    		  System.out.println("Yes");
    	  }
    	  else System.out.println("No");
	    	 
	}
	
}
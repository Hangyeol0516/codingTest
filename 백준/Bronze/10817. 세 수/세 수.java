import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int mid = 0;
        
        if(a>=b) {
			if(b>=c) {
				mid = b;
			}else if(c<=a) {
				mid = c;
			}else {
				mid = a;
			}	
		}else if(a>c) {
			mid = a;
		}else if(b>c) {
			mid = c;
		}else {
			mid = b;
		}   
        System.out.println(mid);	
        
    }
}
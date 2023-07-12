import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		if (str.equals("fdsajkl;") || str.equals("jkl;fdsa")) System.out.println("in-out");
		
		else if (str.equals("asdf;lkj") || str.equals(";lkjasdf")) System.out.println("out-in");
		
		else if (str.equals("asdfjkl;")) System.out.println("stairs");
		
		else if (str.equals(";lkjfdsa")) System.out.println("reverse");
		
		else System.out.println("molu");

	}

}
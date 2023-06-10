import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        String str = scan.next();
        
        int N = scan.nextInt();
        
        int result = 0;
        
        for (int i = 1; i <= N; i++) {
			String mbti = scan.next();
			if (str.equals(mbti)) {
				result++;
			}
		}
        System.out.println(result);
    }
}
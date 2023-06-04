import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[10];
        int remainder[] = new int[42];
        int result = 0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
            remainder[arr[i]%42]++;
        }
        
        for(int i=0; i<remainder.length; i++) {
            if(remainder[i] != 0) {
            	result++;
            }
        }
        System.out.println(result);
    }
}
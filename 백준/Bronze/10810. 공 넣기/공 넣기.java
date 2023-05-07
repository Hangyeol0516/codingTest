import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        
        int arr[] = new int[N];

        for(int i=1 ; i<=M ; i++) {
            int I = scan.nextInt();
            int J = scan.nextInt();
            int K = scan.nextInt();

            for(int j=I-1 ; j<J ; j++) {
                arr[j] = K;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
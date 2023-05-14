import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int temp = 0;
        
        int arr[] = new int[N];
        
        for (int i = 1; i <= arr.length; i++) {
			arr[i-1] = i;
		}

        for(int i=1 ; i<=M ; i++) {
            int I = scan.nextInt();
            int J = scan.nextInt();
            
            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
            
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			int N = scan.nextInt(); // 수열의 크기를 사용자로부터 입력받는 변수
			int arr[] = new int[N]; // 크기가 N인 배열 arr 선언
			
			for (int i = 0; i < N; i++) {
				arr[i] = scan.nextInt();
			} // 배열에 사용자의 입력을 받아 수열 값 저장
			
			Stack<Integer> stack = new Stack<>();// 스택 생성
			StringBuffer bf = new StringBuffer(); // +,-가 저장는 버퍼 생성
			
			int num = 1; // 스택에 push or pop 되는 오름차순 숫자
			boolean result = true;
			// 화면에 결괏값 출력을 제어하기 위한 논리 값
			// ture -> +,-의 조합 출력 (수열 생성), false -> NO 출력(수열 생성 불가)
			
			for (int i = 0; i < arr.length; i++) {
				int su = arr[i];
				
				if (su >= num) {
					while (su >= num) {						
						stack.push(num++);
						bf.append("+\n");
					}
					stack.pop();
					bf.append("-\n");
				}
				else {
					int p = stack.pop(); // 수열 pop()결과 값을 저장
					
					if(p != su) {
						System.out.print("NO");
						result = false; // 출력 제어, bf에 저장된 값 출력 금지
						break;
					} // 수열수와 일치하지 않아 수열 생성 불가
					else {
						bf.append("-\n");
						// pop() 실행되어 버퍼에 '-' 누적(수열수와 일치)
					}
				} 
				
			}
			if (result) {
				System.out.println(bf.toString());
				// 수열이 생성된 경우에만 bf에 저장된 값 출력
			}
	}

}
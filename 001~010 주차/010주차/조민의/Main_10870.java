import java.util.Scanner;
 
public class Main_10870 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int n = in.nextInt();
 
		System.out.println(fibonacci(n));
 
	}
 
	// 피보나치 함수 : 피보나치 수 부터 설명을 하자면 첫번째 항이 0 부터 시작할 경우 첫번째 항은 	//0, 두번째 항은 1부터 시작하여, 다음 항은 직전 항과 직전 항의 직전 항의 합으로 이루어진 수열
	// 재귀를 하다가 N = 1 이거나, N = 0 이면 더이상 함수를 호출하지 않고 return 시키면서 가장 		//안쪽 재귀부터 하나씩 값을 더해 return 해주는 방식
	static int fibonacci(int N) {
		if (n == 0)	return 0;
		if (n == 1)	return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
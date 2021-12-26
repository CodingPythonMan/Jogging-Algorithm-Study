import java.util.Scanner;

public class main_1110 {
	public static void main(String[] args) {
		// 4단계 더하기 사이클
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 0<=정수<=99
		// 첫수 + 다음수 = 합 -> 합의 끝자리수 다음수 = 새로운 수
		int number = N;
		int cycle = 0;

		while (true) {
			number = number % 10 * 10 + (number / 10 + number % 10) % 10;

			cycle++;
			if (N != number) {
				break;
			}

			System.out.println(cycle);
		}

	}
}

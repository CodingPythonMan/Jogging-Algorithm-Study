package sixweeks;

import java.util.Scanner;

public class Main_3052 {
	public static void main(String[] args) {
		// 5단계 42로 나누기
		// A%B = A를 B로 나눈 나머지
		Scanner sc = new Scanner(System.in);

		int[] n = new int[10];// 정수
		int[] remainder = new int[10];// 나머지
		int count = 0;

		for (int i = 0; i < 10; i++) { // 10개 입력
			n[i] = sc.nextInt();
			int temp = n[i] % 42; // 42로 나눈 나머지값

			for (int j = 0; j < remainder.length; j++) { // 10개중 중복값이 있는지 검증하는 부분

				if (remainder[temp] != 0) { // 같은값이 없을때만 숫자를 더해준다.
					count++;
					
				}
			}
		}
		System.out.println(count);
	}

}

package sevenweeks;

import java.util.Scanner;

public class Main_2445 {

	public static void main(String[] args) {
		// 별찍기 - 8 -2445번
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// N번째 줄에 N개의 별을 찍는 문제

		// 상단에 별찍기
		for (int i = 1; i <= N; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int k = 1; k <= 2 * (N - i); k++) {//공백이 8 -> 6 -> 4 -> 2 형식으로 줄어듭니다.
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		// 하단에 별 찍기
		for (int i = 2; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				System.out.print("*");
			}
			for (int k = 1; k < i * 2 - 1; k++) {//공백이 위에랑 반대로 늘어납니다
				System.out.print(" ");
			}
			for (int h = N; h >= i; h--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

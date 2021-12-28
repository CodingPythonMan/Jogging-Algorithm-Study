package sixweeks;

import java.util.Scanner;

public class Main_2441 {

	public static void main(String[] args) {
		// 별찍기 -4 2441

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// N번째 줄에 N개의 별을 찍는 문제

		for (int i = 1; i <= N; i++) {
			for (int j = N-2; j >= N - i; j--) {
				System.out.print(" ");// 공백 개수
			}
			for (int k = N; k >= i; k--) {// 별의 개수
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

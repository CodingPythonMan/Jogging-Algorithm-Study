package sevenweeks;

import java.util.Scanner;

public class Main_2443 {
	public static void main(String[] args) {
		//별찍기 - 6 -2443번
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();// N번째 줄에 N개의 별을 찍는 문제

		for (int i = N; i >= 1; i--) {
			for (int j = 0; j < N - i; j++) {// 공백 개수
				System.out.print(" ");//다시 공백 개수 늘어남
			}
			for (int k = 0; k < (2 * i) - 1; k++) {// 별의 개수
				System.out.print("*"); //별의 개수는 줄어듬
			}
			System.out.println();
		}


	}
}

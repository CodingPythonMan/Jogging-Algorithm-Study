package sevenweeks;

import java.util.Scanner;

public class Main_2440 {
	public static void main(String[] args) {
		//별찍기 - 3 -2440번
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();// N번째 줄에 N개의 별을 찍는 문제

		for (int i = 1; i <= N; i++) {
			for (int k = N; k >= i; k--) {// 별의 개수
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

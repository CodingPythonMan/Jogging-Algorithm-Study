package sixweeks;

import java.util.Scanner;

public class Main_2442 {

	public static void main(String[] args) {
		// 별찍기 -5 2442

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// N번째 줄에 N개의 별을 찍는 문제

		for (int i = 0; i < N; i++) {
			for (int j = N-1; j > i; j--) {// 공백 개수
				System.out.print(" ");//5번째 줄에 4 -> 3 -> 2 -> 1 순으로 공	백이 됨
			}
			for (int k = 0; k <= (2*i); k++) {// 별의 개수
				System.out.print("*");//1 -> 3 -> 5 순으로 별이 찍힘
			}
			System.out.println();
		}

	}

}

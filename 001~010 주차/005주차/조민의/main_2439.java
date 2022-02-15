import java.util.Scanner;

public class main_2439 {//3단계
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();//N번째 줄에 N개의 별을 찍는 문제
		System.out.println( "N ="+ N);

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {//별의 개수
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

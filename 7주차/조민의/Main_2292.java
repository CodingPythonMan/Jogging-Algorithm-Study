import java.util.Scanner;

public class Main_2292 {
//기본 8단계 벌집
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1; // 배열 속 숫자
		int n = sc.nextInt();
		for (int i = 1; i < 18258; i++) { //벌집의 각 줄에서 가장 큰 값 (7, 19, 37, 61..)
			count = count + 6 * i;
			if (n == 1) { //1일 경우 바로 값 도출
				System.out.println(1);
				break;
			}
			else if (count >= n) {
				System.out.println(i + 1); //첫 칸을 제외했으므로 + 1
				break;
			}

		}

	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class Main_10773 {

	public static void main(String[] args) { // 10773번 제로
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		 //ArrayList와 총 합을 넣은 int 변수를 선언

		for (int i = 0; i < count; i++) {
			int num = sc.nextInt();

			if (num != 0) {
				arr.add(num);
				sum += num;

			} else {
				sum -= arr.remove(arr.size() - 1);
 			           //ArrayList의 가장 최근에 받아온 값을 삭제, 총 합에서 해당 값을 뺀다.
			}
		}

		System.out.println(sum);

	}

}
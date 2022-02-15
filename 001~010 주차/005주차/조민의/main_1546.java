import java.util.Arrays;
import java.util.Scanner;

public class main_1546 {//5단계

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//모든 점수 = 점수/M*100
		//원래 점수/최고점*100
		int array = sc.nextInt();
		int[] arr = new int[array];
		
		for (int i = 0; i < array; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		double bestScore = arr[arr.length - 1];
		double hap = 0;

		for (int i = 0; i < array; i++) {
			hap += arr[i] / bestScore * 100;
		}

		System.out.println(hap / array);
	}

}

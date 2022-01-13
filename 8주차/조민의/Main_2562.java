import java.util.Arrays;
import java.util.Scanner;

public class Main_2562 {
	//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//서로 다른 9개의 자연수
		int[] num = new int [9];
		int[] tmp = new int [9];
		//정렬된 배열에서 가장 뒤의 인덱스의 숫자가 가장 큰 숫자
		//index를 뽑아내기 위한 배열 tmp에서 해당 숫자의 인덱스를 뽑아내주면 됩니다
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			tmp[i] = num[i];
		}

		Arrays.sort(num);
		System.out.println(num[8]);//인덱스 0~8까지 나타냄
		for(int i=0; i < num.length; i++) {
			if(tmp[i] == num[8]) {
				System.out.println(i+1);
			}
		}

	}
}
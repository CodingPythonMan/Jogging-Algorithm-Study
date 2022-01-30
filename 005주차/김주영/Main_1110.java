package week5;

import java.util.Scanner;

public class Main_1110 {
	public static void main(String[] args) {
		// 주어진 수가 10보다 작다면 0을 붙여 두자리수 만들기.
		// 앞에서 구한 합의 가장 오른쪽 자리수를 이어 붙이기
		
		// 26 => 2+6=8 => 더한값인 8이 오른쪽, 두번쨰로 더한값이 6, 68
		// 사이클 구하기. 컴퓨터 구하게 하면 된다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 무슨 자료구조를 사용할까?
		// 배열만 사용해도 된다.
		int[] number = new int[2];
		number[0] = n/10;
		number[1] = n%10;
		int countCycle = 0;
		
		// 1. 처음 값과 같을 때까지 while을 돌려야한다.
		do {
			int temp = number[0];
			
			// 2. 사이클 규칙
			number[0] = number[1];
			number[1] = (temp+number[1]) %10;
		
			countCycle ++;
		}
		while(n != (number[1] + number[0]*10));
	
		System.out.println(countCycle);
		sc.close();
	}
}

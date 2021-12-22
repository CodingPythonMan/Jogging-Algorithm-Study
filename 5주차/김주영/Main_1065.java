package week5;

import java.util.Scanner;

public class Main_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 한수에 대한 개념이 필요하다.
		int n = sc.nextInt();
		int[] number = new int[3];
		int answer = 0;
		
		// 1. 100 이하는 그 수가 곧 정답이다.
		if(n < 100) {
			answer = n;
		}else {
			answer = 99;
			// 2. 세자리 수가 관건이다. 
			for(int i=100; i<=n; i++) {
				number[0] = i / 100;
				number[1] = (i%100) / 10;
				number[2] = i % 10;
				
				if((number[0] - number[1]) == (number[1]-number[2])){
					answer++;
				}
			}		
		}
		System.out.println(answer);
		
		sc.close();
	}
}

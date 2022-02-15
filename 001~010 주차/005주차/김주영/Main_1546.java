package week5;

import java.util.Scanner;

public class Main_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] subject = new double[n];
		
		for(int i=0; i<n; i++) {
			subject[i] = sc.nextInt();
		}
		
		double total = 0;
		
		// 1. 최대값을 구해야한다.
		double max = subject[0];
		for(int i=1; i<n; i++) {
			if(max < subject[i]) {
				max = subject[i];
			}
		}
		
		// 2. 최대값 기준으로 점수를 고친다.
		for(int i=0; i<n; i++) {
			subject[i] = subject[i] / max *100;
			// 3. 평균을 구할 총합을 구한다.
			total += subject[i];
		}
		
		System.out.println(total / n);
		sc.close();
	}
}

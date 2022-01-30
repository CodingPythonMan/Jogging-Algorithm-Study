package week5;

import java.util.Scanner;

public class Main_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int standard = sc.nextInt();
		
		int[] number = new int[n];
		
		for(int i=0; i<n; i++) {
			number[i] = sc.nextInt();
			// 수가 더 크다면
			if(standard > number[i]) {
				System.out.print(number[i] + " ");
			}
		}
		
		sc.close();
	}
}

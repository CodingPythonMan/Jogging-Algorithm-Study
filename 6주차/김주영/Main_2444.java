package week6;

import java.util.Scanner;

public class Main_2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			// 1. 공백을 띄워주기
			// 줄마다 i+1만큼 공백을 빼준다.
			for(int j=0; j<n-(i+1); j++) {
				System.out.print(" ");
			}
			
			// 2. 별찍기 (계단형태)
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			
			// 3. 나머지 별찍기
			for(int l=0; l<i; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// 피라미드를 찍었다면 다음은 역계단을 찍으면 된다.
		for(int i=0; i<n-1; i++) {
			// 4. 공백을 띄워주기
			for(int p=0; p<i+1; p++) {
				System.out.print(" ");
			}
			
			// 5. 별찍기 (역계단)
			for(int q=0; q<n-(i+1); q++) {
				System.out.print("*");
			}
			
			// 6. 나머지 별찍기
			for(int r=0; r<n-(i+2); r++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

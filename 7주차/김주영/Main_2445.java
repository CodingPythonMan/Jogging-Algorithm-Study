package week7;

import java.util.Scanner;

public class Main_2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 구역 1
		for(int i=0; i<n; i++) {
			// 별찍기 1
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			// 공백찍기
			for(int k=0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			// 공백찍기
			for(int l=0; l<n-i-1; l++) {
				System.out.print(" ");
			}
			// 별찍기 2
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 구역 2
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print("*");
			}
			for(int k=0; k<i+1; k++) {
				System.out.print(" ");
			}
			for(int l=0; l<i+1; l++) {
				System.out.print(" ");
			}
			for(int m=0; m<n-i-1; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

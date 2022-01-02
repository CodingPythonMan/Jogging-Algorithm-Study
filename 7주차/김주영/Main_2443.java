package week7;

import java.util.Scanner;

public class Main_2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			// 공백 출력
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			// 별찍기 1
			for(int k=i; k<n; k++) {
				System.out.print("*");
			}
			// 별찍기 2
			for(int l=i; l<n-1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

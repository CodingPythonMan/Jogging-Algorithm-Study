package week5;

import java.util.Scanner;

public class Main_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<n+1; i++) {
			for(int j=i; j<n; j++) {
				System.out.print(" ");
			}
			for(int k=i; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

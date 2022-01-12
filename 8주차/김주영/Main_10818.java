package week8;

import java.util.Scanner;

public class Main_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int max;
		int min;
		int number;
		
		max = sc.nextInt();
		min = max;
		
		for(int i=1; i<n; i++) {
			number = sc.nextInt();
			if(max < number) {
				max = number;
			}
			if(min > number) {
				min = number;
			}
		}
		
		System.out.println(min + " " + max);
	}
}

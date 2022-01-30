package week8;

import java.util.Scanner;

public class Main_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int number = 0;
		int remember = 0;
		
		for(int i=1; i<9; i++) {
			number = sc.nextInt();
			if(max < number) {
				max = number;
				remember = i;
			}
		}
		
		System.out.println(max);
		System.out.println(remember+1);
		
		sc.close();
	}
}

package week5;

import java.util.Scanner;

public class Main_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String[] problems = new String[n];
		int[] answers = new int[n];
		int rowCorrect = 0;
		
		// n개의 문제들
		for(int i=0; i<n; i++) {
			problems[i] = sc.nextLine();
			// 1. O 은 1이지만 연속하면 1씩 늘어나야한다.
			for(int j=0; j<problems[i].length(); j++) {
				if(problems[i].charAt(j) == 'O') {
					rowCorrect ++;
					answers[i] += rowCorrect;
				}else {
					rowCorrect = 0;
				}
			}
			rowCorrect = 0;
		}
		
		for(int i : answers) {
			System.out.println(i);
		}
		
		sc.close();
	}
}

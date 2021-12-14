package FourthWeek;

import java.util.Scanner;

public class Main_5585 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		int charge = 1000 - pay;
		int answer = 0;
		
		if(charge >= 500) {
			answer++;
			//System.out.println(500 +" " +  answer);
			charge %= 500;
		}
		if(charge >= 100) {
			answer = answer + (charge / 100);
			//System.out.println(100 +" " +  answer);
			charge %= 100;
		}
		if(charge >= 50) {
			answer = answer + (charge / 50);
			//System.out.println(50 +" " + answer);
			charge %= 50;
		}
		if(charge >= 10) {
			answer = answer + (charge / 10);
			//System.out.println(10 +" " +  answer);
			charge %= 10;
		}
		if(charge >= 5) {
			answer = answer + (charge / 5);
			//System.out.println(10 +" " +  answer);
			charge %= 5;
		}
		answer += charge;

		System.out.println(answer);
		
		sc.close();
	}
}

package week5;

import java.util.Scanner;

public class Main_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String numbers = sc.nextLine();
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			switch(numbers.charAt(i)) {
			case '1':
				sum+=1;
				break;
			case '2':
				sum+=2;
				break;
			case '3':
				sum+=3;
				break;
			case '4':
				sum+=4;
				break;
			case '5':
				sum+=5;
				break;
			case '6':
				sum+=6;
				break;
			case '7':
				sum+=7;
				break;
			case '8':
				sum+=8;
				break;
			case '9':
				sum+=9;
				break;
			default:
				break;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}

package week8;

import java.util.Scanner;

public class Main_2577 {
	public static void main(String[] args) {
		// 이 문제는 숫자로 풀려고 하면 상당히 어렵다.
		// 자릿수의 숫자를 구해야하지만, 자릿수 숫자를 구하기 위해선 퍼센트와 나눗셈이 필요하다.
		// 문자열로 풀자
		
		int numberSum = 1;
		int[] numbers = new int[10];
		Scanner sc = new Scanner(System.in);
	
		for(int i=0; i<3; i++) {
			numberSum *= sc.nextInt();
		}
		
		// 세자리가 곱해진 숫자가 나온다.
		String numberSumStr = String.valueOf(numberSum);
		
		for(int i=0; i<numberSumStr.length(); i++) {
			switch(numberSumStr.charAt(i)) {
			case '0':
				numbers[0]++;
				break;
			case '1':
				numbers[1]++;
				break;
			case '2':
				numbers[2]++;
				break;
			case '3':
				numbers[3]++;
				break;
			case '4':
				numbers[4]++;
				break;
			case '5':
				numbers[5]++;
				break;
			case '6':
				numbers[6]++;
				break;
			case '7':
				numbers[7]++;
				break;
			case '8':
				numbers[8]++;
				break;
			case '9':
				numbers[9]++;
				break;
			}
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		sc.close();
	}
}

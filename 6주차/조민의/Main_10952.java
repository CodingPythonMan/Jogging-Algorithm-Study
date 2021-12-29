package sixweeks;

import java.util.Scanner;

public class Main_10952 {
	public static void main(String[] args) {
		// A+B - 5 4단계 10952번
		Scanner sc = new Scanner(System.in);

		while (true) {// true가 안에 들어가면 숫자가 나열 
			int A = sc.nextInt();
			System.out.println(A);
			int B = sc.nextInt();
			System.out.println(B);
			if(A==0 && B==0){
				sc.close();
				break;
			}
			
			System.out.println(A + B);
		}

	}

}

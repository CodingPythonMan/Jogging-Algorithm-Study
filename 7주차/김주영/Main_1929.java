package week7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		ArrayList<Boolean> primeList;

		// n+1만큼 할당
		primeList = new ArrayList<Boolean>(num2 + 1);
		// 0번째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		// 2~ n 까지 소수로 설정
		for (int i = 2; i <= num2; i++) {
			primeList.add(i, true);
		}

		// 2 부터 ~ i*i <= n
		// 각각의 배수들을 지워간다.
		for (int i = 2; (i * i) <= num2; i++) {
			if (primeList.get(i)) {
				for (int j = i * i; j <= num2; j += i) {
					primeList.set(j, false);
				}
				// i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
			}
		}
		
		for(int i=num1; i<=num2; i++){
			if(primeList.get(i) == true){
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}

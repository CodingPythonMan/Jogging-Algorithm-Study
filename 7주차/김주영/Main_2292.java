package week7;

import java.util.Scanner;

public class Main_2292 {
	public static void main(String[] args) {
		// 1번방에서 출발
		// 2~7번방까진 무조건 2번
		// 8~19번방까진 무조건 3번
		// 20~37번방 4번 ...
 		// 각 방마다 갈 수 있는 번 수가 정해져있다.
		Scanner sc = new Scanner(System.in);
		// 입력은 10억이므로 제한을 int로 해도 충분하다.
		int number = sc.nextInt();
		int room = 1;
		int i =1;
		
		// 등차수열 이내에 있으면 수가 정해진다.
		while(room < number) {
			room += (6*i);
			i++;
		}
		
		System.out.println(i);
						
		sc.close();
	}
}

package week18;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main_2929 {
	public static void main(String[] args) throws Exception{
		// 프로세서의 머신 코드는 명령을 실행할 순서대로 나열한 것이다.
		
		// 각 명령은 메모리를 1바이트 사용한다. 0개 또는 그 이상의 파라미터를 가질 수 있다.
		// 시작 위치를 나누어떨어지게 한다.
		
		// 대문자가 들어가는 곳에서 3개 eof가 있어야한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String command = br.readLine();
		
		int lackParam = 0;
		int distance = 0;
		int before = 0;
		
		// 1. 명령어에서 부족한 파라미터 개수를 찾아야한다.
		for(int i=1; i<command.length(); i++) {
			// 대문자를 발견하고, 다음 대문자까지 몇 거리인지 체크.
			char ch = command.charAt(i);
			if('A' <= ch && ch < 'a') {
				// 그 전거리를 빼주면 된다.
				distance = i - before;
				if((distance%4) != 0) {
					lackParam += (4 - (distance%4));
				}
				before = i;
			}
		}
		
		// 2. 출력
		System.out.println(lackParam);
	}
}

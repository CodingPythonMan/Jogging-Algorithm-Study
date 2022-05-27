package week18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1439 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1로 만드는 경우, 0으로 만드는 경우를 다 챙겨보자.
		
		String S = br.readLine();
		
		System.out.println(Math.min(checkZero(S), checkOne(S)));
	}
	
	public static int checkOne(String S) {
		int zeroCount = 0;
		
		// 0을 찾으면 카운트, 1로 바뀌는 부분까지 체크하지 말고 넘어간다.
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == '0') {
				zeroCount ++;
				while(i < S.length() && S.charAt(i) != '1') {
					i++;
				}
			}
		}
		
		return zeroCount;
	}
	
	public static int checkZero(String S) {
		int oneCount = 0;
		
		// 0을 찾으면 카운트, 1로 바뀌는 부분까지 체크하지 말고 넘어간다.
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == '1') {
				oneCount ++;
				while(i < S.length() && S.charAt(i) != '0') {
					i++;
				}
			}
		}
		return oneCount;
	}
}

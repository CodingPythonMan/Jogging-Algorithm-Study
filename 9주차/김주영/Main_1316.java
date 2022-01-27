package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1316 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		boolean[] answerStr = new boolean[n];
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			str[i] = br.readLine();
		}
		
		// 1. 조사를 해줄 때 조건이 있다.
		// 1-1 해당 문자가 문자 전의 문자와 똑같지 않다.
		// 1-2 똑같지 않고, 해당 문자가 진행된 문자까지 문자열에 이미 존재한다.
		// 조건에 충족되지 않으면, false 이다.
		for(int i=0; i<n; i++) {
			answerStr[i] = true;
			for(int j=1; j<str[i].length(); j++) {
				if(str[i].charAt(j-1) != str[i].charAt(j)) {
					String temp = str[i].substring(0, j);
					if(temp.contains(String.valueOf(str[i].charAt(j)))) {
						answerStr[i] = false;
					}
				}
			}
		}
		
		// 2. 조사가 끝났으면 출력한다.
		for(boolean i : answerStr) {
			if(i) {
				answer++;
			}	
		}
		
		bw.write(String.valueOf(answer));
		
		bw.flush();
		bw.close();
	}
}

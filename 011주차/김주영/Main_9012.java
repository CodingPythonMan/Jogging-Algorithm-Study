package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Main_9012 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] paArray = new String[n];
		String[] answer = new String[n];
		
		for(int i=0; i<n; i++) {
			paArray[i] = br.readLine();
		}
		
		// 1. Stack으로 푼다.
		Stack<Character> stack = new Stack<Character>();
		
		// 2. Stack에 데이터를 집어넣는다.
		for(int i=0; i<n; i++) {
			answer[i] = "YES";
			for(int j=0; j<paArray[i].length(); j++) {
				char c = paArray[i].charAt(j);
				// 오는게 열린 문자라면 push한다.
				if(c == '(') {
					stack.push(c);
				}
				// 닫는 문자가 오는 경우이다.
				else {
					if(stack.isEmpty()) {
						answer[i] = "NO";
						break;
					}
					stack.pop();
				}
			}
			
			// 모두 지났을 때 stack이 비어있지 않다면 NO를 반환한다.
			if(!stack.isEmpty()) {
				answer[i] = "NO";
			}
			
			// 깨끗하게 만든다.
			stack.clear();
		}
		
		for(String s : answer) {
			bw.write(s + "\n");
		}
		
		bw.flush();
	}
}

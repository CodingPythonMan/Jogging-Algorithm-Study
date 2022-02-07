package week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_10773 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<n; i++) {
			int number = Integer.parseInt(br.readLine());
			
			if(number == 0) {
				stack.pop();
			}else {
				stack.push(number);
			}
		}
		
		int answer = 0;
		while(!stack.isEmpty()){
			answer += stack.pop();
		}
		
		bw.write(String.valueOf(answer));
		
		bw.flush();
		bw.close();
	}
}

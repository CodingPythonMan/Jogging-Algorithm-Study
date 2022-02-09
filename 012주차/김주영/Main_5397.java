package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_5397 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		StringBuilder[] pwd = new StringBuilder[n]; 
		
		Stack<Character> preString = new Stack<Character>();
		Stack<Character> postString = new Stack<Character>();
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			pwd[i] = new StringBuilder();
			
			for(int j=0; j<str.length(); j++) {
				char ch = str.charAt(j);
				switch(ch) {
				case '>':
					if(!postString.isEmpty()) {
						preString.push(postString.pop());
					}
					break;
				case '<':
					if(!preString.isEmpty()) {
						postString.push(preString.pop());
					}
					break;
				case '-':
					if(!preString.isEmpty()) {
						preString.pop();
					}
					break;
				default:
					preString.push(ch);
				}
			}
			
			while(!postString.isEmpty()) {
				preString.push(postString.pop());
			}
			
			for(int j=0; j<preString.size(); j++){
				pwd[i].append(preString.elementAt(j));
			}
			
			preString.clear();
		}
		
		for(int i=0; i<n; i++) {
			String s = String.valueOf(pwd[i]);
			System.out.println(s);
		}
	}
}

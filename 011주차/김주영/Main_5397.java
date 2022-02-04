package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_5397 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			String real = "";
			
			for(int j=0; j<input.length(); j++) {
				char c = input.charAt(j);
				
				switch(c) {
				case '>':
				case '<':
					break;
				case '-':
					if(real.length() > 0) {
						
					}
					break;
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
}

package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10872 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int answer = 1;
		
		for(int i=1; i<n+1; i++) {
			answer *= i;
		}
		
		bw.write(String.valueOf(answer));
		
		bw.flush();
		bw.close();
	}
}

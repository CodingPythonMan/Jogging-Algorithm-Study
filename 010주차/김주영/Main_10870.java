package week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10870 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] remember = {1, 1};
		int fibo = 0;
		
		if(n == 1) {
			fibo = 1;
		}else if(n == 2) {
			fibo = 1;
		}
		
		for(int i=2; i<n; i++) {
			fibo = remember[0] + remember[1];
			remember[0] = remember[1];
			remember[1] = fibo;
		}
		
		bw.write(String.valueOf(fibo));
		
		bw.flush();
		bw.close();
	}
}

package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1193 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		// 1. 분수를 찾아야한다.
		// 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2...
		// x/y로 나눠서 1씩 증가하면 어떨까?
		
		// 대각선으로 나눠서 봐보자.
		// 대각선 1행은 1/1, 대각선 2행에는 1/2, 2/1 이 있다.
		int line =0;
		int cnt = 0;
		int top;
		int bottom;
		
		while(cnt < n) {
			line++;
			cnt = line*(line+1)/2;
		}
		
		if(line % 2 != 0) {
			top = 1+(cnt-n);
			bottom = line-(cnt-n);
			bw.write(top + "/" + bottom);
		}else {
			top = line-(cnt-n);
			bottom = 1 + (cnt-n);
			bw.write(top + "/" + bottom);
		}
		
		bw.flush();
		bw.close();
	}
}
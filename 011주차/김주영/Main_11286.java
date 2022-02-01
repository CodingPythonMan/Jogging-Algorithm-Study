package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main_11286 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Number> pq = new PriorityQueue<Number>();
		
		for(int i=0; i<n; i++) {
			int input = Integer.parseInt(br.readLine());
			Number number;
			
			if(input != 0) {
				if(input > 0) {
					number = new Number(false, input);
				}else {
					number = new Number(true, input);
				}
				pq.add(number);
			}else {
				// number가 0일 때
				number = pq.poll();
				if(number.minus) {
					bw.write(String.valueOf(number.value));
				}else {
					bw.write(String.valueOf(-number.value));
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
	
	public static class Number{
		boolean minus;
		int value;
		
		public Number(boolean minus, int value) {
			this.minus = minus;
			this.value = value;
		}
	}
}

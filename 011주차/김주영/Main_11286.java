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
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) ->{
			int a = Math.abs(o1);
			int b = Math.abs(o2);

			if(a > b) {
				return 1;
			}else if(a == b){
				if(o1 > o2) {
					return 1;
				}else {
					return -1;
				}
			}else {
				return -1;
			}
		});
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num != 0) {
				pq.add(num);
			}else {
				if(pq.isEmpty()) {
					bw.write(String.valueOf(0)+"\n");
				}else {
					bw.write(String.valueOf(pq.poll()+"\n"));
				}
			}
		}

		bw.flush();
		bw.close();
	}
}

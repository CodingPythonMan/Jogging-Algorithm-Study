package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2164 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		boolean first = true;
		
		Queue<Integer> queue = new LinkedList<Integer>();

		// 1. 우선 코드를 추가해 넣는다.
		for(int i=0; i<n; i++) {
			queue.add(i+1);
		}
		
		// 2. 작업을 진행한다.
		while(queue.size() >= 1) {
			if(first) {
				answer = queue.poll();
				first = false;
			}else {
				answer = queue.peek();
				queue.add(answer);
				queue.poll();
				first = true;
			}
		}
		
		bw.write(String.valueOf(answer));
		
		bw.flush();
		bw.close();
	}
}

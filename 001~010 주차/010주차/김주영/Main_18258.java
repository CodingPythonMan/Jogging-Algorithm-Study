package week10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main_18258 {
	public static class Que {

		LinkedList<Integer> lin = new LinkedList<Integer>(); 
		
		public void push(int x) {
			lin.add(x);
		}
		
		public int size() {
			return lin.size();
		}
		
		public int front() {
			if(!lin.isEmpty()) {
				return lin.getFirst();
			}else {
				return -1;
			}
		}
		
		public int back() {
			if(!lin.isEmpty()) {
				return lin.getLast();
			}else {
				return -1;
			}
		}
		
		public int empty() {
			if(lin.isEmpty()) {
				return 1;
			}else {
				return 0;
			}
		}
		
		public int pop() {
			if(lin.isEmpty()) {
				return -1;
			}else {
				int first = lin.getFirst();
				lin.remove();
				return first;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Que que = new Que();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			String com = br.readLine();

			if (com.indexOf("push") != -1) {
				String[] temp = com.split(" ");
				int x = Integer.parseInt(temp[1]);
				que.push(x);
				continue;
			}
			if (com.indexOf("front") != -1) {
				sb.append(que.front() + "\n");
				continue;
			}
			if (com.indexOf("back") != -1) {
				sb.append(que.back() + "\n");
				continue;
			}
			if (com.indexOf("size") != -1) {
				sb.append(que.size() + "\n");
				continue;
			}
			if (com.indexOf("empty") != -1) {
				sb.append(que.empty() + "\n");
				continue;
			}
			if (com.indexOf("pop") != -1) {
				sb.append(que.pop() + "\n");
				continue;
			}
		}
		
		System.out.println(sb);
	}
}

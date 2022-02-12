package week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_2075 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		//int[][] graph = new int[n][n];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int j=0;
			while(st.hasMoreTokens()) {
				//graph[i][j] = Integer.parseInt(st.nextToken());
				pq.add(Integer.parseInt(st.nextToken()));				
				j++;
			}
		}
		
		for(int i=0; i<n-1; i++) {
			pq.poll();
		}
		
		System.out.println(pq.poll());
	}
}

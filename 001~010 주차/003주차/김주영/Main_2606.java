package ThirdWeek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2606 {
	static int[][] route;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = 1;
		
		route = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			route[s][e] = 1;
			route[e][s] = 1;
		}
		
		bfs(start);
		
		sc.close();
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visited[start] = true;
		int count = 0;
		
		while(!queue.isEmpty()) {
			//System.out.println("들어오나요?");
			int temp= queue.poll();
			for(int i=1; i<visited.length; i++) {
				if(route[temp][i] == 1 && visited[i] == false) {
					queue.offer(i);
					visited[i] = true;
					count ++;
				}
			}
		}
		System.out.println(count);
	}
}

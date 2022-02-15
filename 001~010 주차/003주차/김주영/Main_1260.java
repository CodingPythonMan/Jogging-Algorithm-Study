package ThirdWeek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main_1260 {
	static int[][] route;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		route = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			route[s][e] = 1;
			route[e][s] = 1;
		}
		
		dfs(v);
		System.out.println();
		for(int i=0; i<visited.length; i++) {
			visited[i] = false;
		}
		bfs(v);
		
		sc.close();
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			System.out.print(temp + " ");
			
			for(int i=1; i<visited.length; i++) {
				if(route[temp][i] == 1 && visited[i] == false ) {
					queue.offer(i);
					visited[i] = true; 
				}
			}
		}
	}
	
	public static void dfs(int start) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(start);
		visited[start] = true;
		
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			System.out.print(temp + " ");
			
			for(int i=0; i<visited.length; i++) {
				if(route[temp][i] == 1 && visited[i] == false) {
					dfs(i);
				}
			}
		}
	}
}

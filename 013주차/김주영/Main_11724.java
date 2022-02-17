package week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11724 {
	static int [][] map;
	static boolean[] visited;
	static int n;
	static int e;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		map = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i=0; i<e; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a][b] = 1;
			map[b][a] = 1;	
		}
		
		int count = 0;
		for(int i=1; i<n+1; i++) {
			if(visited[i] == false) {
				count ++;
				visited[i] = true;
				dfs(i);
			}
		}
		
		System.out.println(count);
	}
	
	static void dfs(int index) {
		for(int i=1; i<n+1; i++) {
			if(map[index][i] == 1 && visited[i] == false) { 
				visited[i] = true;
				dfs(i);
			}
		}
	}
}

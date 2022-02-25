package week14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1743 {
	static boolean[][] map;
	static boolean[][] visited;
	static int row;
	static int column;
	static int n;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		column = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		map = new boolean[row+1][column+1];
		visited = new boolean[row+1][column+1];
		                      
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = true;
		}
		
		bfs();
	}
	
	public static void bfs() {
		Queue<Position> queue = new LinkedList<Position>();
		
		for(int i=0; i<row+1; i++) {
			for(int j=0; j<column+1; j++) {
				if(map[i][j]) {
					
				}
			}
		}
	}
	
	public static class Position{
		int x;
		int y;
		
		Position(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}

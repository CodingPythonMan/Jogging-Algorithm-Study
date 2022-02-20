package week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1987 {
	static int row;
	static int column;
	static char[][] map;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static boolean[] visited;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		row = Integer.parseInt(st.nextToken());
		column = Integer.parseInt(st.nextToken());
		
		map = new char[row][column];
		visited = new boolean[26];
		
		for(int i=0; i<row; i++) {
			String str = br.readLine();
			for(int j=0; j<column; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		bfs();
	}
	
	public static void bfs() {
		Queue<Position> queue = new LinkedList<Position>();
		Position pos = new Position(0,0,1);
		queue.add(pos);
		visited[map[0][0] - 'A'] = true;
		int max = 0;
		
		while(!queue.isEmpty()) {
			int nextX;
			int nextY;
			pos = queue.poll();
			
			max = Math.max(pos.distance, max);
			
			for(int i=0; i<4; i++) {
				nextX = pos.x + dx[i];
				nextY = pos.y + dy[i];
				
				if(nextX >= 0 && nextY >= 0 && nextX < column && nextY < row) {
					if(visited[map[nextY][nextX] - 'A'] == false) {
						pos = new Position(nextX, nextY, (pos.distance+1));
						visited[map[nextY][nextX] - 'A'] = true;
						queue.add(pos);
					}
				}
			}
		}
		
		System.out.println(max);
	}
	
	public static class Position{
		int x;
		int y;
		int distance;
		
		Position(int x, int y, int distance){
			this.x = x;
			this.y = y;
			this.distance = distance;
		}
	}
}

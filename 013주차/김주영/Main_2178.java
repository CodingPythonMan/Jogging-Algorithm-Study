package week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2178 {
	static char[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][] visited;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int row = Integer.parseInt(st.nextToken());
		int column = Integer.parseInt(st.nextToken());
		
		map = new char[row][column];
		visited = new boolean[row][column];
		
		for(int i=0; i<row; i++) {
			String str = br.readLine();
			for(int j=0; j<column; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		bfs(row, column);
	}
	
	public static void bfs(int row, int column) {
		Queue<Position> queue = new LinkedList<Position>();
		Position pos = null;
		queue.add(new Position(0, 0, 0));
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			pos = queue.poll();
			pos.distance ++;
			
			if(pos.y == (row-1) && pos.x == (column-1)) {
				break;
			}
			
			for(int i=0; i<4; i++) {
				if(pos.x + dx[i] > -1 && pos.y + dy[i] > -1 && 
						pos.x + dx[i] < map[0].length && pos.y + dy[i] < map.length) {
					if(map[pos.y+dy[i]][pos.x+dx[i]] == '1' && visited[pos.y+dy[i]][pos.x+dx[i]] == false) {
						queue.add(new Position(pos.x+dx[i], pos.y+dy[i], pos.distance));
						visited[pos.y+dy[i]][pos.x+dx[i]] = true;
					}
				}
			}
		}
		
		int answer = pos.distance;
		System.out.println(answer);
	}
	
	static class Position{
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

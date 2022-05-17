package week12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1012 {
	static int[] answer;
	static int w, h;
	static int[][] map;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static boolean[][] visited;
	
	static class Position{
		int x;
		int y;
		
		Position(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		answer = new int[N];
		
		int m;
		int x, y;
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			map = new int[h][w];
			visited = new boolean[h][w];
			
			for(int j=0; j<m; j++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				
				map[y][x] = 1;
			}
			
			for(int j=0; j<h; j++) {
				for(int k=0; k<w; k++) {
					if(map[j][k] == 1 && !visited[j][k]) {
						visited[j][k] = true;
						dfs(new Position(k,j));
						answer[i] ++;
					}
				}
			}
		}

		for(int i=0; i<N; i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static void dfs(Position pos) {
		for(int i=0; i<4; i++) {
			int newY = pos.y + dy[i];
			int newX = pos.x + dx[i];
			
			if(newY >= 0 && newX >= 0
				&& newX < w && newY < h) {
				if(map[newY][newX] == 1 && !visited[newY][newX]) {
					visited[newY][newX] = true;
					dfs(new Position(newX, newY));
				}
			}
		}
	}
}

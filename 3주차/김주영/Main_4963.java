package ThirdWeek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_4963 {
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {1, 1, 1, -1, -1, -1, 0, 0};
	static int[] dy = {-1, 0, 1, -1, 0, 1, -1, 1};
	static class Node{
		int x,y;
		
		public Node(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h, count = 0;
		
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			
			if(w == 0 && h == 0) {
				break;
			}
			
			map = new int[h][w];
			visited = new boolean[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(map[i][j] == 1 && visited[i][j] == false) {
						bfs(i, j);
						count++;
					}
				}
			}
			
			System.out.println(count);
			count = 0;
		}
		
		sc.close();
	}
	
	public static void bfs(int h, int w) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(new Node(h,w));
		visited[h][w] = true;
		
		while(!queue.isEmpty()) {
			Node node= queue.poll();
			for(int i=0; i<8; i++) {
				if(node.x+dx[i] >= 0 && node.y+dy[i] >= 0 && node.x+dx[i] < map.length && node.y+dy[i] < map[0].length) {
					if(map[node.x+dx[i]][node.y+dy[i]] == 1 && visited[node.x+dx[i]][node.y+dy[i]] == false) {
						queue.offer(new Node(node.x+dx[i], node.y+dy[i]));
						visited[node.x+dx[i]][node.y+dy[i]] = true;
					}
				}
			}
		}
	}
}

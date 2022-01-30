package ThirdWeek;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main_2667 {
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {1,0,0,-1};
	static int[] dy = {0,1,-1,0};
	static PriorityQueue<Integer> house;
	
	static class Node{
		int x,y;
		
		public Node(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, count = 0;
		String line;
		
		house = new PriorityQueue<Integer>();
		
		n = sc.nextInt();
			
		map = new int[n][n];
		visited = new boolean[n][n];
			
		for(int i=0; i<n; i++) {
			line = sc.next();
			for(int j=0; j<n; j++) {
				map[i][j] = Character.getNumericValue(line.charAt(j));
			}
		}
			
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 1 && visited[i][j] == false) {
					bfs(i, j);
					count++;
				}
			}
		}
			
		
		System.out.println(count);
		
		while(!house.isEmpty()) {
			System.out.println(house.poll());
		}
		
		sc.close();
	}
	
	public static void bfs(int w, int h) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(new Node(w, h));
		visited[w][h] = true;
		int count = 1;
		
		while(!queue.isEmpty()) {
			Node node= queue.poll();
			for(int i=0; i<4; i++) {
				if(node.x+dx[i] >= 0 && node.y+dy[i] >= 0 && node.x+dx[i] < map.length && node.y+dy[i] < map[0].length) {
					if(map[node.x+dx[i]][node.y+dy[i]] == 1 && visited[node.x+dx[i]][node.y+dy[i]] == false) {
						queue.offer(new Node(node.x+dx[i], node.y+dy[i]));
						visited[node.x+dx[i]][node.y+dy[i]] = true;
						count++;
					}
				}
			}
		}
		
		house.add(count);
	}
}

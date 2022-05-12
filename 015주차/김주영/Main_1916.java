package week15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main_1916 {
	static int V, E, start, end;
	static int[] distance;
	static ArrayList<Node>[] nodeList;
	
	public static class Node implements Comparable<Node>{
		int weight;
		int pos;
		
		public Node(int pos, int weight){
			this.weight = weight;
			this.pos = pos;
		}

		@Override
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		V = Integer.parseInt(br.readLine());
		E = Integer.parseInt(br.readLine());
		
		// 초기화
		distance = new int[V+1];
		for(int i=1; i<V+1; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		nodeList = new ArrayList[V+1];
		for(int i=1; i<V+1; i++) {
			nodeList[i] = new ArrayList<Node>();
		}
		
		for(int i=1; i<E+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
		
			nodeList[n].add(new Node(m, w));
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		
		dijkstra(start, end);
		
		System.out.println(distance[end]);
	}
	
	static void dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(new Node(start, 0));
		
		distance[start] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			// 큐에서 뽑아낸 거리가 이미 갱신된 거리보다 클 경우 무시
			if(now.weight > distance[now.pos]) {
				continue;
			}
			
			// 큐에서 뽑아낸 노드와 인접 노드를 탐색
			int len = nodeList[now.pos].size();
			for(int i=0; i<len; i++) {
				Node next = nodeList[now.pos].get(i);
				if(distance[next.pos] > now.weight + next.weight) {
					distance[next.pos] = now.weight + next.weight;
					pq.add(new Node(next.pos, distance[next.pos]));
				}
			}
		}
	}
}

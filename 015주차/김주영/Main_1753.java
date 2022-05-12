package week15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_1753 {
	static int[] distance;
	static ArrayList<Edge>[] edgeList;
	static int V, E, start;

	static class Edge implements Comparable<Edge> {
		int id;
		int cost;

		public Edge(int id, int cost) {
			this.id = id;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());

		int start = Integer.parseInt(br.readLine());

		// 초기화
		edgeList = new ArrayList[V+1];
		for (int i = 1; i < V + 1; i++) {
			edgeList[i] = new ArrayList<Edge>();
		}

		distance = new int[V+1];
		for (int i = 1; i < V + 1; i++) {
			distance[i] = Integer.MAX_VALUE;
		}

		for (int i = 1; i < E + 1; i++) {
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			edgeList[n].add(new Edge(m, w));
		}

		dijkstra(start);

		for (int i = 1; i < V + 1; i++) {
			if (distance[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(distance[i]);
			}
		}
	}

	public static void dijkstra(int start) {
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		distance[start] = 0;
		pq.add(new Edge(start, 0));

		while (!pq.isEmpty()) {
			Edge now = pq.poll();

			if (now.cost > distance[now.id])
				continue;

			int len = edgeList[now.id].size();
			for (int i = 0; i < len; i++) {
				Edge next = (Edge) edgeList[now.id].get(i);

				if (distance[next.id] > now.cost + next.cost) {
					distance[next.id] = now.cost + next.cost;
					pq.add(new Edge(next.id, distance[next.id]));
				}
			}

		}
	}
}

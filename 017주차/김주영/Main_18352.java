package week17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

public class Main_18352 {
	static int N, M, K, X;
	static Vector<Integer>[] v;
	static int[] dist;
	
	public static void main(String[] args) throws Exception{
		// 어떤 나라에는 1번부터 N번까지 도시, M개의 단방향 도로 존재
		// 모든 도로 거리 1
		
		// 이 때 특정한 도시 X에서 출발
		// 도달할 수 있는 모든 도시 중, 최단 거리가 정확히 K인
		// 모든 도시들의 번호를 출력하는 프로그램을 작성하시오.
		
		// 출발 도시 X에서 출발 도시 X로 가는 최단거리는 0
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] sarr = br.readLine().split(" ");
		
		N = Integer.parseInt(sarr[0]);
		M = Integer.parseInt(sarr[1]);
		
		K = Integer.parseInt(sarr[2]);
		X = Integer.parseInt(sarr[3]);
		
		// 주어지는 건 단방향 도로다.
		v = new Vector[N + 1];
		for (int i = 0; i <= N; i++)
			v[i] = new Vector<>();

		dist = new int[N + 1];
		for (int i = 0; i <= N; i++)
			dist[i] = Integer.MAX_VALUE;

		for (int i = 0; i < M; i++) {
			sarr = br.readLine().split(" ");
			int A = Integer.parseInt(sarr[0]);
			int B = Integer.parseInt(sarr[1]);
			v[A].add(B);
		}

		dijkstra();

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			if (dist[i] == K)
				list.add(i);
		}

		if (list.size() == 0)
			bw.write(-1 + "\n");
		else {
			for (int n : list) {
				bw.write(n + "\n");
			}
		}
		bw.flush();
	}

	public static void dijkstra() {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		dist[X] = 0;
		pq.offer(X);

		while (!pq.isEmpty()) {

			int n = pq.poll();

			for (int m : v[n]) {

				if (dist[m] > dist[n] + 1) {
					dist[m] = dist[n] + 1;
					pq.offer(m);
				}
			}

		}
	}
}

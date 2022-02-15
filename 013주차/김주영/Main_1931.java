package week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_1931 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Time[] times = new Time[n];
		
		PriorityQueue<Time> pq = new PriorityQueue<Time>((o1, o2) -> {
			if(o1.endTime > o2.endTime) {
				return 1;
			}else if(o1.endTime == o2.endTime){
				if(o1.startTime > o2.startTime) {
					return 1;
				}else if(o1.startTime == o2.startTime) {
					return 0;
				}else {
					return -1;
				}
			}else {
				return -1;
			}
		});
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			times[i] = new Time();
			times[i].startTime = Integer.parseInt(st.nextToken());
			times[i].endTime = Integer.parseInt(st.nextToken());
		
			pq.add(times[i]);
		}
		
		int count = 0;
		int prevTime = 0;
		
		while(!pq.isEmpty()) {
			Time time = pq.poll();
			if(prevTime <= time.startTime) {
				prevTime = time.endTime;
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	static class Time{
		public int startTime;
		public int endTime;
	}
}

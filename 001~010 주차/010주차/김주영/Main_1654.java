package week10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1654 {
	public static void main(String[] args) throws Exception{
		// 자체적으로 K개의 랜선을 가지고 있다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		long max = 0;
		
		int[] array = new int[K];
		for(int i=0; i<K; i++) {
			array[i] = Integer.parseInt(br.readLine());
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		max ++;
		
		long min = 0; // 탐색 길이 최솟값
		long mid = 0;
		
		while(min < max) {
			mid = (max + min) / 2;
			long count = 0;
			
			for(int i=0; i<array.length; i++) {
				count += (array[i]/mid);
			}
			
			if(count < N) {
				max = mid;
			}else {
				min = mid + 1;
			}
		}
		
		System.out.println(min - 1);
	}
}

package week16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10025 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] array = new int[1000001];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
		
			array[p] = w;
		}
		
		int sum = 0;
		int max = 0;
		int d = 1 + (2*K);
		for(int i=0; i<=1000000; i++) {
			if(i >= d) {
				sum -= array[i-d];
			}
			sum += array[i];
			if(sum > max) {
				max = sum;
			}
		}
		
		System.out.println(max);
	}
}

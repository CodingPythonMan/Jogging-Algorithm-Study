package week12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2294 {
	static int[] coins;
	static Integer[] dp;
	static int K;
	
	public static void main(String[] args) throws Exception{
		// 불가능한 경우 -1 출력이 동전1과 다르다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
	
		coins = new int[N];
		dp = new Integer[K+1];
		
		for(int i=0; i<N; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		// 1. 최소를 구해야하므로 최대값으로 우선 초기화
		for(int i=0; i<K+1; i++) {
			dp[i] = 10001;
		}
		
		dp[0] = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=coins[i]; j<K+1; j++) {
				dp[j] = Math.min(dp[j], dp[j-coins[i]] + 1);
			}
		}
		
		if(dp[K] == 10001) {
			System.out.println(-1);
		}else {
			System.out.println(dp[K]);
		}
	}
}

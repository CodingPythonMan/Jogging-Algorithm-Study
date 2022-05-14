package week14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2156 {
	static int N;
	static int[] podoju;
	static Integer[] dp;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());

		podoju = new int[N+1];
		dp = new Integer[N+1];
		for(int i=1; i<N+1; i++) {
			podoju[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = podoju[1];
		if(N > 1) {
			dp[2] = podoju[1] + podoju[2];
		}
		
		System.out.println(choosePodoju(N));
	}
	
	public static int choosePodoju(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(Math.max(choosePodoju(n-2), choosePodoju(n-3)
			+ podoju[n-1]) + podoju[n], choosePodoju(n-1));
		}
		
		return dp[n];
	}
}

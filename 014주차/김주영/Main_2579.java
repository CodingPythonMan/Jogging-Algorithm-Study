package week14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2579 {
	static int N; 
	static int[] dp;
	static int[] score;
	
	public static void main(String[] args) throws Exception{
		// 계단 꼭대기 도착점까지 가는 게임
		// 연속된 세 개의 계단을 모두 밟아서는 안된다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		dp = new int[N+1];
		score = new int[N];
		
		for(int i=0; i<N; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(solveStairs());
	}
	
	
	// 이것보다 재귀를 사용하면 코드 간결성이 커진다.
	public static int solveStairs() {
		dp[0] = score[0];
		if(N == 1) {
			return dp[0];
		}
		dp[1] = score[0] + score[1];
		if(N == 2) {
			return dp[1];
		}
		dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);
		if(N == 3) {
			return dp[2];
		}
		
		for(int i=3; i<N; i++) {
			dp[i] = Math.max(dp[i-3] + score[i-1] + score[i], dp[i-2] + score[i]);
		}
		
		return dp[N-1];
	}
}

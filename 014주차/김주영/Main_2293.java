package week14;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main_2293 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		int[] coin = new int[N];
		int[] dp = new int[N];

		for(int i=1; i<K; i++) {
			
			dp[i] = dp[i-1] + dp[i-coin[i]];
		}
	}
}

package week17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1010 {
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());	// N = r
			int M = Integer.parseInt(st.nextToken());	// M = n
						
			sb.append(combi(M, N)).append('\n');
		}
		
		System.out.println(sb);
	}

	static int combi(int n, int r) {

		// 이미 풀린 경우 바로 반환
		if (dp[n][r] > 0) {
			return dp[n][r];
		}

		// 2번 성질
		if (n == r || r == 0) {
			return dp[n][r] = 1;
		}

		// 1번 성질
		return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
	}
}

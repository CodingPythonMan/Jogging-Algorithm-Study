package week18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_22342 {
	public static void main(String[] args) throws Exception{
		// M개의 행(가로줄)과 N개의 열(세로줄)이 있는 격자의 각 칸에는 로봇이 있다.
		// 각 행에는 위에서부터 아래로 1부터 M까지의 번호가 붙어 있고,
		// 각 열에는 왼쪽에서부터 오른쪽으로 1부터 N까지의 번호가 붙어있다.
		
		// 이를 통해 격자 칸의 위치를 (행 번호, 열 번호)의 좌표로 표시할 수 있다.
		// 각 로봇은 하나 이상의 입력 값, 하나의 저장 값, 하나의 출력 값을 가진다.
		
		// 제일 왼쪽 열의 로봇들로부터 열 번호 순서대로 동작한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[][] weight = new int[w][h];

		for(int i=0; i<w; i++) {
			String row = br.readLine();
			for(int j=0; j<h; j++) {
				weight[i][j] = row.charAt(j) - '0';
			}
		}
		
		int answer = -1;
	    for (int j = 0; j < h; j++) {
	        for (int i = 0; i < w; i++) {
	            int tmp = 0;
	            if (j > 0) {
	                tmp = weight[i][j - 1];
	                if (i > 0) tmp = Math.max(tmp, weight[i - 1][j - 1]);
	                if (i < w - 1) tmp = Math.max(tmp, weight[i + 1][j - 1]);
	                weight[i][j] += tmp;
	            }
	            answer = Math.max(answer, tmp);
	        }
	    }
	    System.out.println(answer);
	}
}

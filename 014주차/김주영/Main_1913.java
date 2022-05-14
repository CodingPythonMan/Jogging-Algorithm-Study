package week14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1913 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int find = Integer.parseInt(br.readLine());
		int end = N * N;
		
		int x = N/2;
		int y = N/2;
		int[][] table = new int[N][N];
		int num = 0;

		int limit = 1;
		while(true) {
			for(int i=0; i<limit; i++) {
				table[y--][x] = ++num;
			}

			if(num == end) {
				break;
			}
			
			for(int i=0; i<limit; i++) {
				table[y][x++] = ++num;
			}
			limit++;
			for(int i=0; i<limit; i++) {
				table[y++][x] = ++num;
			}
			
			for(int i=0; i<limit; i++) {
				table[y][x--] = ++num;
			}
			limit++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(table[i][j] == find) {
					x = i+1;
					y = j+1;
				}
				sb.append(table[i][j] + " ");
			}
			sb.append("\n");
		}
		sb.append(x + " " + y);
		System.out.println(sb.toString());
	}
}

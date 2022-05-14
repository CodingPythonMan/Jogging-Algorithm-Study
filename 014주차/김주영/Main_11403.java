package week14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11403 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// j에서 k까지 갈 수 있는가?
		// j에서 i까지 가고, i에서 k로 갈 수 있는가?
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(map[j][i] == 1 && map[i][k] == 1) {
						map[j][k] = 1;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sb.append(map[i][j] + " ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
	}
}

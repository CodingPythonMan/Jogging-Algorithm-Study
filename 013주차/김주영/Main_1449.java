package week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1449 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int tapeLength = Integer.parseInt(st.nextToken());
		int[] reaks = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			reaks[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(reaks);
		
		boolean[] pipes = new boolean[reaks[n-1]+1];
		
		for(int i=0; i<n; i++) {
			pipes[reaks[i]] = true;
		}
		
		int count = 0;
		// true인 부분을 막는다.
		for(int i=0; i<pipes.length; i++) {
			if(pipes[i] == true) {
				count ++;
				for(int j=0; j<tapeLength; j++) {
					if(i+j == pipes.length) {
						break;
					}
					pipes[i+j] = false;
				}
			}
		}
		
		System.out.println(count);
	}
}

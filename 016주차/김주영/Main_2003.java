package week16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2003 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] array = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int left=0, right=0;
		int sum=0;
		int count=0;
		
		while(true) {
			if(sum >= M) {
				sum -= array[left];
				left++;
			}else if(right >= N) {
				break;
			}else {
				sum += array[right];
				right++;
			}
			
			if(sum == M) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}

package week18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_1026 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
	
		int[] array1 = new int[N];
		Integer[] array2 = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			array1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			array2[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2번째 배열은 재배열하지 못한다.
		// 공식이 있지 않을까? 
		Arrays.sort(array1);
		Arrays.sort(array2, Comparator.reverseOrder());
		
		int ans = 0;
		for(int i=0; i<N; i++) {
			ans += array1[i] * array2[i];
		}
		System.out.println(ans);
	}
}

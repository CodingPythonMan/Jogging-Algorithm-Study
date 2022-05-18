package week10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main_10816 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		// N 은 1<= N <= 500,000
		int[] cards = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		// M 은 1<= M <= 500,000
		int[] needs = new int[M];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			needs[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(cards);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			int up = upperBound(cards, needs[i]);
			int down = lowerBound(cards, needs[i]);
			
			sb.append((up-down) + " ");
		}
		
		System.out.println(sb);
	}
	
	public static int lowerBound(int[] arr, int key) {
		int low = 0;
		int high = arr.length;
		
		while(low < high) {
			int mid = (low + high) / 2;
			
			if(key <= arr[mid]) {
				high = mid;
			}else {
				low = mid + 1;
			}
		}
		
		return low;
	}
	
	public static int upperBound(int[] arr, int key) {
		int low = 0;
		int high = arr.length;
		
		while(low < high) {
			int mid = (low + high) / 2;
			
			if(key < arr[mid]) {
				high = mid;
			}else {
				low = mid + 1;
			}
		}
		
		return low;
	}
}

package week16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_3273 {
	public static void main(String[] args) throws Exception{
		// a1~an 이루어진 수열
		// 자연수 x가 주어졌을 때, ai+aj = 를 만족하는 쌍 수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		int x = Integer.parseInt(br.readLine());
		
		int left=0,right=n-1,count=0,sum=0;
		
		while(left < right) {	
			sum = array[left] + array[right];
			
			if(sum == x) {
				count++;
			}
			
			if(sum <= x) {
				left++;
			}else {
				right--;
			}
		}
		
		System.out.println(count);
	}
}

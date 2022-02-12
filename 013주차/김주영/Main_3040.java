package week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_3040 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numbers = new int[9];
		int total = 0;
		int[] answer = new int[2];
		
		for(int i=0; i<9; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			total += numbers[i];
		}
		
		Arrays.sort(numbers);
		for(int i = 0 ; i<numbers.length;i++) {
			for(int j = 1 ; j < 9;j++) {
				if(numbers[i]+numbers[j]==total-100) {
					answer[0]=i;
					answer[1]=j;
					break;
				}
			}
		}
		for(int i = 0 ; i < numbers.length;i++) {
			if(i==answer[0]||i==answer[1]) {
				continue;
			}
			System.out.println(numbers[i]);
		}
	}
}

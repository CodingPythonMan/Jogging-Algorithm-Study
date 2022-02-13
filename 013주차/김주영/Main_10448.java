package week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10448 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[45];
		int[] answer = new int[n];
		
		numbers[0] = 1;
		for(int i=1; i<numbers.length; i++) {
			numbers[i] = numbers[i-1] + (i+1);
		}
		
		int input = 0;
		for(int k=0; k<n; k++) {
			input = Integer.parseInt(br.readLine());
			
			for(int i=0; i<45; i++) {
				for(int j=0; j<45; j++) {
					for(int l=0; l<45; l++) {
						if(numbers[i] + numbers[j] + numbers[l] == input) {
							answer[k] = 1;
						}
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(answer[i]);
		}
	}
}

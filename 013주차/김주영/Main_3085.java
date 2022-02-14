package week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3085 {
	static int max = 0;
	 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[][] board = new char[n][n];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				board[i][j] = str.charAt(j);
			}
		}
		
		// 가로 바꾸기
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				char temp = board[i][j];
				board[i][j] = board[i][j+1];
				board[i][j+1] = temp;
				
				check(board, n);
				
				temp = board[i][j];
				board[i][j] = board[i][j+1];
				board[i][j+1] = temp;
			}
		}
		
		// 세로 바꾸기
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				char temp = board[j][i];
				board[j][i] = board[j+1][i];
				board[j+1][i] = temp;
				
				check(board, n);
				
				temp = board[j][i];
				board[j][i] = board[j+1][i];
				board[j+1][i] = temp;
			}
		}
		
		System.out.println(max);
	}
	
	static void check(char[][] board, int n) {
		int count1 = 1;
		int count2 = 1;
		
		// 가로 체크
		for(int i=0; i < n; i++) {
			for(int j=0; j<n-1; j++) {
				if(board[i][j] == board[i][j+1]) {
					count1++;
				}else {
					count1 = 1;
				}
				max = Math.max(max, count1);
			}
			count1 = 1;
		}
		
		// 세로 체크
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(board[j][i] == board[j+1][i]) {
					count2++;
				}else {
					count2 = 1;
				}
				max = Math.max(max, count2);
			}
			count2 = 1;
		}
	}
}

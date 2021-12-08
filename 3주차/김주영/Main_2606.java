package ThirdWeek;

import java.util.Scanner;

public class Main_2606 {
	static int[][] route;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		route = new int[n+1][n+1];
		for(int i=0; i<m; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			route[s][e] = 1;
			route[e][s] = 1;
		}
		
		
	}

}

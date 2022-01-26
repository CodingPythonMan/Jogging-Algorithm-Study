package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_4344 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		double[][] students = new double[n][];
		double[] average = new double[n];
		double[] answer = new double[n];
		int num = 0;
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			students[i] = new double[num];
			
			for(int j=0; j<num; j++) {
				students[i][j] = Integer.parseInt(st.nextToken());
				average[i] += (students[i][j] / num);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<students[i].length; j++) {
				if(average[i] <= students[i][j]) {
					answer[i] ++; 
				}
			}
			answer[i] /= num;
		}
		
		for(int i=0; i<n; i++) {
			bw.write(String.format("%.3f", (answer[i]*100)) + "%\n");
		}
		bw.flush();
	}
}

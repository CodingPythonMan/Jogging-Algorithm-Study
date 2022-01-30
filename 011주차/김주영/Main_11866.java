package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11866 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		boolean[] people = new boolean[num1+1];
		int point = 0;
		int answer = 0;
		
		bw.write("<");
		// 1. people의 숫자만큼 돌아간다.
		for(int i=0; i<num1; i++) {
			for(int j=0; j<num2; j++) {
				// false는 삭제가 되지 않은 것.
				if(people[point]){
					j--;
				}
				point++;
				if(point >= num1) {
					point %= num1;
				}
			}
			answer = point;
			if(point == 0) {
				people[num1-1] = true;
				answer = num1;
			}else {
				people[point-1] = true;
			}
			
			bw.write(String.valueOf(answer));
			if(i != num1-1) {
				bw.write(", ");
			}
		}
		bw.write(">");
		
		bw.flush();
	}
}
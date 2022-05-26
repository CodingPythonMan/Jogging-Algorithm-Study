package week17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main_11399 {
	public static void main(String[] args) throws Exception{
		// ATM 앞에 N명 사람들이 줄을 서있다.
		// 1번 ~ N번까지 번호가 매겨져있다.
		
		// i번 사람이 돈을 인출하는데 걸리는 시간은 Pi분이다.
		// 3 1 4 3 2 1번 사람은 3분만에 돈을 뽑을 수 있다.
		
		// 필요한 시간의 합을 최소로 만들 수 없다.
		// 시간이 빠른 사람부터 앞으로 가야한다.
		
		// 정렬만 시키면 된다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] people = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {	
			people[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(people);
		
		int[] sum = new int[N];
		sum[0] = people[0];
		int total = sum[0];
		
		for(int i=1; i<N; i++) {
			sum[i] = sum[i-1] + people[i];
			total += sum[i];
		}
		
		System.out.println(total);
	}
}

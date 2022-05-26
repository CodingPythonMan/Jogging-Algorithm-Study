package week17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main_1715 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정렬된 두 묶음의 숫자 카드가 있다고 하자.
		// 묶음된 카드의 수를 A, B라 하면, 보통 두 묶음을 합쳐서
		// 하나로 만드는 데에는 A+B번의 비교를 해야한다.
		
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Long> nums = new PriorityQueue<Long>();
		
		for(int i=0; i<N; i++) {
			nums.add(Long.parseLong((br.readLine())));
		}
		
		long total = 0;

		while(nums.size() > 1) {
			long a = nums.poll();
			long b = nums.poll();
			
			total += (a+b);			
			nums.add(a+b);
		}
		
		System.out.println(total);
	}
}

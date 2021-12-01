package SecondWeek;

import java.util.PriorityQueue;

public class Main_Heap_001 {
	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int k = 7;

		System.out.println(solution(scoville, k));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> heapMin = new PriorityQueue<Integer>();
		for (int i = 0; i < scoville.length; i++) {
			heapMin.offer(scoville[i]);
		}

		// try catch를 사용하여 만약 Overflow가 생길 경우 answer = -1로 설정한다.
		// 또는 힙 사이즈가 1이 됬는데 스코빌이 K보다 작으면 더 이상 만들 수 없으므로 answer = -1을 한다.
		while (heapMin.peek() < K) {
			try {
				int new_food = heapMin.poll() + heapMin.poll() * 2;
				heapMin.offer(new_food);
				answer++;

				if (heapMin.peek() >= K)
					break;
				if (heapMin.size() == 1 && heapMin.peek() < K) {
					answer = -1;
					break;
				}
			} catch (Exception e) {
				answer = -1;
			}
		}

		return answer;
	}
}

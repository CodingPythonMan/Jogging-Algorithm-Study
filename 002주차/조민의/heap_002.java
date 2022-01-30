import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {//scoville = 모든 음식의 스코빌 지수, k = 스코빌 지수
        //힙은 자동 오름차순의 개념
        //제일 작은값과 하나 더 큰값을 꺼내 연산 후에 비교
        int answer = 0;
        
        //모든 음식의 스코빌 지수를 min heap에 저장
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int food : scoville) {
            heap.add(food);
        }
        
        //스코빌 지수가 K 미만인 음식이 있는 경우
        while(heap.peek() < K) {
            //새로운 음식 만들기
            heap.add(heap.poll() + heap.poll()*2);
            answer++;
            
            //모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
            //힙에 남은 한 개의 음식의 스코빌 지수가 K 미만인 경우 모든 음식의 
	//스코빌 지수를 K 이상으로 만들 수 없는 경우이므로 answer을 -1로 설정한 뒤 종료
            if (heap.size() == 1 && heap.peek() < K) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}
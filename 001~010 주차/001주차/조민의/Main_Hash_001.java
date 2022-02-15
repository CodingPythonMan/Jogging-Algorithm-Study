import java.util.HashMap; 
import java.util.Iterator;
import java.util.Map;


public class Main_Hash_001 {
	public String solution(String[] participant, String[] completion) {
		String answer = ""; //초기화 값
		HashMap<String, Integer> map = new HashMap<>();//key, value의 값을 해쉬로 나타냄
		for (String player : participant)
			map.put(player, map.getOrDefault(player, 0) + 1); 
		for (String player : completion) 
			map.put(player, map.get(player) - 1); 
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator(); 
		while(iter.hasNext()){ Map.Entry<String, Integer> entry = iter.next(); 
		if (entry.getValue() != 0){
			answer = entry.getKey();
			break;
			} 
		} return answer; 
		} 
	public static void main(String[] args){ 
		String[] part = {"leo", "kiki", "eden"};//시도한 사람
		String[] comp = {"eden", "kiki"};//완주한 사람
		Solution_Sort sol = new Solution_Sort();//완주하지못한 사람을 담을 배열
		System.out.println(sol.solution(part, comp)); //완주 못하는 사람이 나오는 식
		}


public class Solution_Sort {
	public String solution(String[] participant, String[] completion) {
		// 1. 두 배열을 정렬한다
		Arrays.sort(participant); 
		Arrays.sort(completion);
		// 2. 두 배열이 다를 때까지 찾는다 
		int i = 0; for(i=0;i<completion.length;i++) 
			if(!participant[i].equals(completion[i])) break;
		// 3. 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미이다.
		return participant[i];
		} 
	public static void main(String[] args){
		String[] part = {"leo", "kiki", "eden"};
		String[] comp = {"eden", "kiki"};
		Solution_Sort sol = new Solution_Sort();
		
		System.out.println(sol.solution(part, comp)); 
		}
	}



}

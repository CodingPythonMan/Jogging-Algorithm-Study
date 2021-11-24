import java.util.HashMap; 
import java.util.Iterator;
import java.util.Map;


public class Hash {
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



}

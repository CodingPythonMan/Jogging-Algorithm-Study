import java.util.Arrays;

public class Main_Hash_001 {
	public static String solution(String[] participant, String[] completion) {
		// 입력받는 두 배열 sort를 통해 정렬
		// 알파벳 순으로 정렬되게 됨.
		Arrays.sort(participant);
        Arrays.sort(completion);
        
        String answer = null;
        int i = 0;
        
        // 하나만 다르고 똑같은 요소를 가진 배열들이 알파벳 순으로 정렬됌.
        // 둘 배열 순서가 똑같게 되어 다른 완주자가 있을경우 캐치
        while (i < completion.length) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
            i++;
        }

        return participant[i];
        
	}
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		System.out.println(solution(participant, completion));
	}
}

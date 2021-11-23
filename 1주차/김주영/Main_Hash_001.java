import java.util.Arrays;

public class Main_Hash_001 {
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = null;
        int i = 0;
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

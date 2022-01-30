package SecondWeek;

import java.util.Arrays;

public class Main_Sort_002 {
	public static void main(String[] args) {
		int[] numbers = { 6, 10, 2 };
		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		String answer = "";

		String[] stringNums = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			stringNums[i] = Integer.toString(numbers[i]);
		}
		Arrays.sort(stringNums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

		if (stringNums[0].equals("0"))
			return "0";
		for (var number : stringNums) {
			answer += number;
		}

		return answer;
	}
}

package week12;

public class Programmars_EnglishWord {
	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));
		System.out.println(solution("23four5six7"));
		System.out.println(solution("2three45sixseven"));
		System.out.println(solution("123"));
	}
	
	public static int solution(String s) {
		int answer = 0;

		String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		
		for (int i = 0; i < numbers.length; i++) {
			int pos = s.indexOf(numbers[i]);

			while (pos != -1) {
				s = changeString(pos, numbers[i], s);
				pos = s.indexOf(numbers[i]);
			}
		}

		answer = Integer.parseInt(s);

		return answer;
	}

	public static String changeString(int pos, String num, String s) {
		String changeNum = " ";
		int numLen = num.length();
		int sLen = s.length();

		switch (num) {
		case "zero":
			changeNum = "0";
			break;
		case "one":
			changeNum = "1";
			break;
		case "two":
			changeNum = "2";
			break;
		case "three":
			changeNum = "3";
			break;
		case "four":
			changeNum = "4";
			break;
		case "five":
			changeNum = "5";
			break;
		case "six":
			changeNum = "6";
			break;
		case "seven":
			changeNum = "7";
			break;
		case "eight":
			changeNum = "8";
			break;
		case "nine":
			changeNum = "9";
			break;
		}

		return s.substring(0, pos) + changeNum + s.substring(pos + numLen, sLen);
	}

}

import java.util.Arrays;
import java.util.Comparator;
 
public class Solution {
	/*1. 주어진 정수 배열을 문자열처럼 합해야 하기 때문에 String으로 변환한다.

2. Comparator을 사용해 정수의 조합이 큰 경우 변경되어야 하기 때문에 앞에 변경해야 하는 경우 뒤에 변경할 필요 없는 경우를 놓았다.

3. 0으로만 구성되어 있는 경우도 있을 수 있으므로 그런 경우엔 0을 return 한다.

(이 경우 때문에 테스트 케이스 하나가 계속 틀릴 것이다... 마지막 테스트 케이스가 안 되는 경우에는 이 경우를 생각해야 한다!!)

4. 정렬이 되어있는 배열을 순차적으로 더해 결과값을 반환한다.*/
 
    public String solution(int[] numbers) {
        // 숫자를 String 문자형으로 바꾸기 위해 strNumbers 라는 String형 배열 준비.
        String[] strNumbers = new String[numbers.length];
	//numbers = 0 또는 양의 정수가 담긴 배열
	//numbers.length = 배열의 길이 값
 
        // String형 배열 strNumbers에 valueOf 메소드를 사용해 숫자를 문자로 바꿔 저장.
        // valueOf () 메소드는 인자에 들어있는 객체를 String 객체로 형 변환 시켜주는 메소드.
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
 
        // 컬렉션 프레임워크 Arrays 클래스의 sort 메소드사용.
        // Comparator 메서드를 사용해 객체간의 특정한 정렬을 한다.
        // compare() 메서드를 오버라이딩해서 숫자간 비교.
         //Arrays 사용해 재정의 한다.
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        //예외 처리-순차적으로 저장 후 값을 return 한다.
        // 맨 처음 문자가 0이면 0반환
        if (strNumbers[0].equals("0")) {
            return "0";
        }
 
        // String strNumber에 순차적으로 저장해 answer로 return
        String answer = "";
        for (String strNumber : strNumbers) {
            answer += strNumber;
        }
 
        return answer;
 
    }
 
    public static void main(String[] args) {
        Solution s = new Solution();
        int number[] = { 6, 10, 2 };
        int number2[] = { 3, 30, 34, 5, 9 };
        System.out.println(s.solution(number));
        System.out.println(s.solution(number2));
    }
}
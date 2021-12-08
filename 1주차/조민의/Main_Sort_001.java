import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //답을 알려주는 배열
        //결과값 담을 배열 answer는 commands와 길이가 같기 때문에 commands길이로 초기화하기로 한다
        for (int i=0; i<commands.length; i++) { 
            int[] result = new int[commands[i][1] - (commands[i][0]-1)];
            
            for (int j=0; j<result.length; j++) { //결과값의 길이를 정한다.
                result[j] = array[j + commands[i][0]-1];
            }
            Arrays.sort(result);//순서를 정렬한 후 answer 배열에 3번째의 값을 넣는다
            answer[i] = result[commands[i][2]-1];
        }
        
        return answer;
    }
}
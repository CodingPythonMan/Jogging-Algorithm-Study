
public class Main_Brute_001 {
	public static int[] solution(int[] answers) {
		int[] students = new int[3];
        int[][] pattern = {{1,2,3,4,5},
        		{2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
  
        // 1. 3명 패턴만 추가하여 푼다.
        for(int i=0; i<3; i++) {
        	for(int j=0; j<answers.length; j++) {
        		if(answers[j] == pattern[i][j%pattern[i].length]) {
        			students[i] ++;
    			}
        	}
        }
        
        int max = students[0];
        // 2. 최대값 구하기
        for(int i=1; i<students.length; i++) {
        	if(max < students[i]) {
        		max = students[i];
        	}
        }
        
        // 3. 몇 명인가요
        int count=0;
        
        for(int i=0; i<students.length; i++) {
        	if(max == students[i]) {
        		count++;
        	}
        }
        
        int[] answer = new int[count];

        int count1 = 0;
       
        for(int i=0; i<students.length; i++) {
        	if(max == students[i]) {
        		answer[count1] = i+1;
        		count1++;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] answer = {1,3,2,4,2};
		answer = solution(answer);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}

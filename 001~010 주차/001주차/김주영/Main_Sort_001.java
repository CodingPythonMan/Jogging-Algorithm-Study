import java.util.Arrays;

public class Main_Sort_001 {
	public static int[] solution(int[] array, int[][] commands) {
		int count = 0;
		int[] answer = new int[commands.length];
			
		for(int i=0; i<commands.length; i++) {
			int[] arrayInt = new int[commands[i][1] - (commands[i][0]-1)];
			for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
				arrayInt[count] = array[j];
				count ++;
			}
			Arrays.sort(arrayInt);
			answer[i] = arrayInt[commands[i][2]-1];
			count = 0;
		}
        
        return answer;
	}
	
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		int[] result = solution(array, commands);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

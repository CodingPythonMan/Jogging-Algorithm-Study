package greedy;
import java.util.Arrays;


public class Solution {
	  public int solution(int n, int[] lost, int[] reserve) {
		  //int n-전체 학생수, int[] lost-잃어버린 학생수, int[] reserve-여벌의 체육복을 가져온 학생들의 번호
	        int answer = 0; //답변

	        
	        //여벌 옷을 가지고 있는 학생이 도난 당하면 빌려줄 수 없도록 만든다.
	        //for 문을 돌리면서,마지막 학생까지 반복문을 돌린다.
	        //해당 학생은(=여벌 체육복을 가져왔으나 체육복을 도난당한 경우) 
	        //학생 자신은 체육 수업에 참가할 수 있으므로 answer를 1 증가시킨다.
	        for(int i=0; i<lost.length; i++) {
	            for(int j=0; j<reserve.length; j++) {
	                if(lost[i]==reserve[j]) {
	 
	                    lost[i] = -1;
	                    reserve[j] = -1;
	                    break;
	                }
	            }
	        }
	        
	        //옷을 빌려주고 -1로 만들어 뒤의 학생에게 빌려주지 않게 한다.
	        //answer은 전체 학생수에서 잃어버린 학생 수를 뺀다.
	        //후에 여벌옷을 가진 학생이 도난 당했으면 그 수만큼 더해주고 
	        //옷을 빌려준 학생 수 만큼 다시 더해준다.
	        
	  for (int i = 0; i < reserve.length; i++) {
	        for (int j = 0; j < lost.length; j++) {
	            if(reserve[i] != 100 && lost[j] != 100) {
	                if(Math.abs(reserve[i] - lost[j]) == 1) {
	                    reserve[i] = 100; 
	                    lost[j] = 100; 
	                    answer++; 
	                    break;                     
	                }            
	            }
	        }
	    }
	       
	        return answer;
	    }

}

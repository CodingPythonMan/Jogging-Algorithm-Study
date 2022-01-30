simport java.util.ArrayList;
//맨처음 주어진 배열의 값이 종료가 필요한 도달값
//progresses 의 각각의 값들은 100이 되면 종료되어지는 개념
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {//progresses = 작업의 진도가 적힌 정수 배열
                				       //speeds = 각 작업의 개발 속도가 적힌 정수 배열
        int[] answer = new int[progresses.length];
        //시간 측정
        for(int i=0; i < progresses.length;i++){ 
        	int prog = progresses[i];
        	int workingTime = 0;
        	while(true){
        		if(prog >= 100) break;
        		prog += speeds[i];
        		workingTime++;  //일한 시간
        	}
        	answer[i] = workingTime;
        }

	/*#1. 첫번째 순서 조사
 	- 데이터 : [7일, 3일, 9일]  
 	- 7일보다 작으면 모두 7일 이내의 결과로 포함
	 - 그러므로 결과는 2

 	#2. 두번째는 완료이므로 세번째로 건너가 조사
	 - 데이터 : [완료, 완료, 9일]  
	 - 9일보다 작으면 모두 9일 이내의 결과로 포함
	 - 9일이 마지막이므로 결과는 1
 
	#3. 결과 : [2, 1]*/
 
        //조사가 완료되면 다음 조사에 포함되지 않는 값을 넣어주고 다음 차례로 넘겨야할 continue가 필요
        
        //값 확인
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i < answer.length ; i++){  //기준값
            int origin = answer[i];
            int count = 1; //같이 배포될 기능 개수
            if(origin < 0){continue;} //조사가 완료된 대상이면 건너뛰기
            for(int j=i+1 ; j < answer.length ; j++){  //기준값 다음의 값
            	int compare = answer[j];
            	if(origin >= compare){
            		answer[j] = -1; //조사가 완료되었으므로 대상에서 제거
            		count++;
            	} else {
            		break;
            	}
            }
            list.add(count);
        }        
        answer = list.stream().mapToInt(i ->i).toArray();
        return answer;
    }
}
package SecondWeek;

public class Main_StackQueue_001 {
	static class Operation{
		int progress;
		int speed;
		boolean completion;
		boolean distributed;
		int completionDate;
		
		Operation() {
			completion = false;
			distributed = false;
			completionDate = 0;
		}
	}
	
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1,30,5};
		
		int[] answer = solution(progresses, speeds);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
    
    public static int[] solution(int[] progresses, int[] speeds) {
		Operation[] operation = new Operation[progresses.length];
		int[] answer = {};
		
		// 1. 초기 대입
		for(int i=0; i<progresses.length; i++) {
			operation[i] = new Operation();
			operation[i].progress = progresses[i];
			operation[i].speed = speeds[i];
		}
		
		// 2. 각 작업들 완료일자 기록
		for(int i=0; i<operation.length; i++) {
			// 작업 완료 할 때까지 반복
			while(!operation[i].completion) {
				operation[i].progress += operation[i].speed;
				operation[i].completionDate ++;
				if(operation[i].progress >= 100) {
					operation[i].completion = true;
				}
			}
		}
		int[] distributeAmount = new int[operation.length];
		int count = 0;
		
		// 3. 완료일자 바탕으로 배포수 결정
		for(int i=0; i<operation.length-1; i++) {
			for(int j=i+1; j<operation.length; j++) {
				if(operation[i].distributed == true) {
					break;
				}
				if(operation[i].completionDate < operation[j].completionDate) {
					operation[i].distributed = true;
					distributeAmount[count] ++;
					count++;
					break;
				}
				operation[j].distributed = true;
				distributeAmount[count] ++;
				
			}
		}
        
        if(operation[operation.length-1].distributed)
        {
       	    distributeAmount[count] ++;
        }else {
			operation[operation.length-1].distributed = true;
			distributeAmount[count] ++;
		}
		
		answer = deleteBackZeroIntArray(distributeAmount);
        
        return answer;
    }
    
    public static int[] deleteBackZeroIntArray(int[] tempArray) {
		int countZero = 0;
		
		for(int i : tempArray) {
			if(i == 0) {
				countZero ++;
			}
		}

		int[] intArray = new int[tempArray.length - countZero];
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = tempArray[i];
		}
		return intArray; 
	}
}

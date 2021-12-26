import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
					
		// 입력받은 문자열을 '-'을 기준으로 스플릿 해준다. 
                         //.split 함수는 입력받은 정규 표현식 또는 특정 문자를 기준으로 문자열 나누어 배열에 저장하고 리턴
		//split 함수는 형변환을 기억! 
                         String n[] = in.next().split("-");
		
		// 최소값이 저장 될 변수.
		int sum = Integer.MAX_VALUE;
		
		// 스플릿 된 문자열 배열
		for(int i=0;i<n.length;i++) {
			int temp = 0;
						
			// 또 다시 '+'를 기준으로 열 기준으로 나워준다 해준다.
			String cal[] = n[i].split("\\+");
			
			// 추출된 정수들을 모두 더해준다.
			for(int j=0;j<cal.length;j++) {
				temp+=Integer.parseInt(cal[j]);
			}
			
			// 첫 문자라면,
			if(sum == Integer.MAX_VALUE) 
				// 대입한다.
				sum = temp;
			else
				// 첫 문자에서 계속해서 위에서 더해준 값들을 빼주면 된다.
				sum-= temp;				
		}
		
		System.out.println(sum);
		
		in.close();
	}

}
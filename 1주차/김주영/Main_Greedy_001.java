
public class Main_Greedy_001 {
	// n은 전체 학생 수, lost 도난당한 학생, reserve는 여벌 체육복 가진 학생
	private static int solution(int n, int[] lost, int[] reserve) {
		// 2<= n <=30
		// 1<= lost.length <=n, 중복x
		// 1<= reserve.length <=n, 중복 x
		// 체육수업 듣는 최대값
		int result = 0;
		Student[] students = new Student[n];
		for(int i=0; i<students.length; i++) {
			students[i] = new Student();
		}
		
		// 1. lost 학생은 체육복이 없다.(reserve 배열도 제거)
		for(int i=0; i<lost.length; i++) {
			students[lost[i]-1].existCloth = false;
			for(int j=0; j<reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					reserve[j] = -1;
				}
			}
		}
		
		// 2. reserve 앞 번호부터 체크하여 하나를 준다.
		for(int i=0; i<reserve.length; i++) {
			if(reserve[i] == -1) {
				continue;
			}
			// 앞 번호
			if(reserve[i]-1 > 0) {
				if(students[reserve[i]-2].existCloth == false ) {
					students[reserve[i]-2].existCloth = true;
					continue;
				}
			}
			
			// 뒷 번호
			if(reserve[i]+1 < reserve.length+1) {
				if(students[reserve[i]].existCloth == false ) {
					students[reserve[i]].existCloth = true;
					continue;
				}
			}
		}
		
		// 3. 학생이 체육복을 가지고 있는가 체크
		for(int i=0; i<n; i++) {
			if(students[i].existCloth == true) {
				result++;
			}
		}
		return result;
	}
	
	// 학생 객체가 있으므로 클래스 생성
	public static class Student{
		private boolean existCloth;
		public Student(){
			existCloth = true;
		}
	}
	
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};

		System.out.println(solution(n, lost, reserve));
	}
}

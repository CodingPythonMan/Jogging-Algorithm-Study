import java.util.Scanner;

public class main_10951 {
	public static void main(String[] args) {
		//4단계 정수 A+B
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {//true가 안에 들어가면 숫자가 나열 런타임 에러
		// while 조건 중스캐너에 hasNextInt()를 넣으면  EOF처리
			int A = sc.nextInt();
			System.out.println(A);
			int B= sc.nextInt();
			System.out.println(B);
			System.out.println(A+B);
		}
		
	}
}

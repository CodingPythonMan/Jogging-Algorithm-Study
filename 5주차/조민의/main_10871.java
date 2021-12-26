import java.util.Scanner;

public class main_10871 {//3단계
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //정수  n
		int x = sc.nextInt();  //정수  X
		
		//둘째 줄에 수열 a를 이루는 정수 n개
		for (int i = 0; i < n; i++) {
			 int a = sc.nextInt();
	            if(a<x) {
	                System.out.println(a);
	            }
		}
	}
}

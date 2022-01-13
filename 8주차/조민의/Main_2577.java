import java.util.Scanner;

public class Main_2577 {
	//입력된 숫자들을 곱한 값에 0~9 각 자리 수에 해당하는 개수 구하기
 	 public static void main(String[] args) {

    		Scanner scanner = new Scanner(System.in);

   		 int A = scanner.nextInt();
   		 int B = scanner.nextInt();
  		 int C = scanner.nextInt();

   		 int temp = A*B*C;  //변수 temp에 저장

   		 int[] num = new int[10];//열번째 줄까지 횟수

    		 for ( int i = 0; i < 10; i++ ) {
			num[i]=0;
                          }
		 while(temp/10 !=0){
			num[temp%10]++;
			temp = temp/10;
		 }
		 num[temp]++;

  		  for ( int i = 0; i <10; i++ ) {
     			 System.out.println(num[i]);  //한줄씩 출력
    		  }
 	 }
}
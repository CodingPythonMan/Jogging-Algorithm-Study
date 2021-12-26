import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//버퍼를 이용해서 입출력을 효율적으로 하기 위한 함수, 모아뒀다가 한번에 전송
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
                         //br.readLine() 은 문자열로 데이터를 읽으니 반드시 꺼내서 쓸 때 int 형으로 쓰고자 한다면
                         // Integer.parseInt()로 String 을 int 형으로 변환
		
 
		if (N == 4 || N == 7) {
			System.out.println(-1);
		}
		else if (N % 5 == 0) {
			System.out.println(N / 5);
		}
		else if (N % 5 == 1 || N % 5 == 3) {
			System.out.println((N / 5) + 1);
		}
		else if (N % 5 == 2 || N % 5 == 4) {
			System.out.println((N / 5) + 2);
		}
	}
}
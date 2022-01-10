import java.util.*;

public class Main_1929 {
//9단계 (도전) 에라토스테네스의 체

    public static void main(String[] args) {

	//소수를 찾는데 O(n)만큼의 시간이 나오고 m만큼의 입력값이 들어오니 O(n^2)만큼의 시간이 들고, 다른 방법을 사용해도 O(n*n^1/2)만큼의 시간 	//복잡도 나오게 된다.
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] check = new boolean[1000000001];
        // 에라토스테네스의 체
        check[0] = check[1] = true;
        for(int i = 2; i <= N; i++){
            if(check[i] == false){
                if(i >= M)
                    System.out.println(i);
                for(int j = i+i; j <= N; j+=i)
                    check[j] = true;
            }
        }
    }
}
import java.util.Scanner;

public class Main_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result =1;  //길이가 기므로
        for (int i = 1; i <=n ; i++) {
            result *= i;
        }
        System.out.println(result);

    }

}
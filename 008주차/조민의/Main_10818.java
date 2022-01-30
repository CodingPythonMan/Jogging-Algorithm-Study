import java.util.Scanner;

public class Main_10818 {
	//N개의 정수가 주어진다. 이때, 최솟값과 최댓값
   	 public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

       	 int N = sc.nextInt();
       	 int min = 100001, max = -1000001; 
	 //모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수

       	 for(int i = 0; i < N; i++) {
            	     int x = sc.nextInt();
           	     if(x < min) min = x;
                  if(x > max) max = x;
             }

        System.out.println(min + " " + max);
    }
}
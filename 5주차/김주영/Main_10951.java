package week5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자를 몇개 받을지 모른다.
		// 선입선출
		Queue<Integer> numberStack = new LinkedList<Integer>();
		
		// EOF 처리
		while(sc.hasNext()) {
			numberStack.add(sc.nextInt());
		}
		
		// 선입 선출하여 합을 구한다.
		while(!numberStack.isEmpty()) {
			System.out.println(numberStack.poll() + numberStack.poll());
		}
		
		sc.close();
	}
}

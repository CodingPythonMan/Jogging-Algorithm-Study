package week6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_3052 {
	public static void main(String[] args) {
		// Set은 중복값이 들어가지 않는다.
		Set<Integer> restSet = new HashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		
		for(int i=0; i<10; i++) {
			number[i] = sc.nextInt();
			restSet.add(number[i]%42);
		}
		
		System.out.println(restSet.size());
		sc.close();
	}
}

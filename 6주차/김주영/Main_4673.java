package week6;

import java.util.ArrayList;
import java.util.List;

public class Main_4673 {
	public static void main(String[] args) {
		List<Integer> nonSelfNum = new ArrayList<Integer>();
		int number;
		
		for(int i=0; i<10000; i++) {
			if(i<10) {
				number = i + i;
			}else if(i<100) {
				number = i + (i%10) + (i/10);
			}else if(i<1000){
				number = i + (i%10) + ((i%100)/10) +(i/100);
			}else {
				number = i + (i%10) + ((i%100)/10) + ((i%1000)/100) + (i/1000);
			}
			nonSelfNum.add(number);
		}
		
		for(int i=0;i<10000; i++) {
			if(!nonSelfNum.contains(i)) {
				System.out.println(i);
			}
		}
	}
}

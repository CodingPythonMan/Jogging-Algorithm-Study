package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main_1302 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		// 1. book 입력받을 때 hashmap에 넣어주기
		for(int i=0; i<n; i++) {
			String book = br.readLine();
			
			if(hm.containsKey(book)) {
				hm.replace(book, hm.get(book)+1);
			}else {
				hm.put(book, 1);
			}
		}
		
		int max = 0;
		for(int books : hm.values()) {
			if(max < books) {
				max = books;
			}
		}
		
		// 2. hashmap 가장 큰 밸류의 키값 찾기
		ArrayList<String> names = new ArrayList<String>(hm.keySet());
		Collections.sort(names);
		for(String bookName : names) {
			if(hm.get(bookName) == max) {
				bw.write(bookName);
				break;
			}
		}
		
		bw.flush();
		bw.close();
	}
}

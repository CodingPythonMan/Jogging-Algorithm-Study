package week12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_16916 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String P = br.readLine();
		
		System.out.println(KMP(S,P));
		
	}
	
	static int KMP(String parent, String pattern){
		int[] table = makeTable(pattern);
		
		int n1 = parent.length(), n2 = pattern.length();
		int begin =0, matched=0; // begin = matched = 0
		while(begin <= n1-n2) {
			// 만약 짚더미의 해당 글자가 바늘의 해당 글자가 같다면
			if(matched < n2 && parent.charAt(begin+matched) == pattern.charAt(matched)) {
				++matched;
				// 결과적으로 m글자가 모두 일치했다면 답에 추가한다.
				if(matched == n2) {
					return 1;
				}
			}else{
				// 예외 : matched가 0인 경우에는 다음 칸에서부터 계속 
				if(matched ==0) {
					++begin;
				}else {
					begin += matched - table[matched-1];
					// begin을 옮겼다고 처음부터 다시 비교할 필요가 없다.
					// 옮긴 후에도 table[matched-1]만큼은 항상 일치하기 때문이다.
					matched = table[matched-1];
				}
			}
		}
		return 0;
	}
	
	static int[] makeTable(String pattern) {
		int n = pattern.length();
		int[] table = new int[n];
			
		int idx=0;
		for(int i=1; i<n; i++) {
	        // 일치하는 문자가 발생했을 때(idx>0), 연속적으로 더 일치하지 않으면 idx = table[idx-1]로 돌려준다.
			while(idx>0 && pattern.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx-1];
			}
				
			if(pattern.charAt(i) == pattern.charAt(idx)) {
				idx += 1;
				table[i] = idx;  
			}
		}
		return table;
	}
}

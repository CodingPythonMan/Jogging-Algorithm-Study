package week15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_1764 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 알고리즘으로 풀고, 그 알고리즘으로 푼 이유를 말해라.
		Set<String> notListen = new TreeSet<String>();
		Set<String> notSee = new TreeSet<String>();
		// addAll() 합집합
		// retainAll() 교집합
		// removeAll() 차집합
		// containsAll() 집합 포함 여부
		
		for(int i=0; i<N; i++) {
			notListen.add(br.readLine());
		}
		for(int i=0; i<M; i++) {
			notSee.add(br.readLine());
		}
		
		notListen.retainAll(notSee);
		
		System.out.println(notListen.size());
		
		Iterator<String> iter = notListen.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Treeset으로 푼 이유는 정렬된 Set이 필요했고,
		// 교집합을 쓸 생각이었기 때문이다.
	}
}

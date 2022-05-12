package week15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_1620 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int pokemons = Integer.parseInt(st.nextToken());
		int problems = Integer.parseInt(st.nextToken());
		
		// 무슨 알고리즘을 쓸 것인가?
		// 문자열 검색에는 해싱이 가장 좋다.
		// 숫자 검색은 배열을 쓰자.
		HashMap<String, String> pokeDict = new HashMap<String, String>();
		for(int i=1; i<pokemons+1; i++) {
			String pokemon = br.readLine();
			pokeDict.put(pokemon, String.valueOf(i));
			pokeDict.put(String.valueOf(i), pokemon);
		}
		
		// 들어온게 문자열인지, 숫자인지 판단해야한다.
		for(int i=0; i<problems; i++) {
			String pokemon = br.readLine();
			System.out.println(pokeDict.get(pokemon));
		}
	}
}

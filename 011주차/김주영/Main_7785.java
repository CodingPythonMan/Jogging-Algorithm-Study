package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_7785 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[][] logs = new String[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			logs[i][0] = st.nextToken();
			logs[i][1] = st.nextToken();
		}
		
		HashSet<String> emps = new HashSet<String>();
		for(int i=0; i<n; i++) {
			String emp = logs[i][0];
			switch(logs[i][1]) {
			case "enter":
				emps.add(emp);
				break;
			case "leave":
				emps.remove(emp);
				break;
			}
		}
		
		ArrayList<String> empsSort = new ArrayList<String>(emps);
		Collections.sort(empsSort, Comparator.reverseOrder());
		
		for(String emp : empsSort) {
			bw.write(emp + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}

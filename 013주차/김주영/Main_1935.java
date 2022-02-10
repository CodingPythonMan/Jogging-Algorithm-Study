package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_1935 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		double[] numbers = new double[n];
		Stack<Double> cals = new Stack<Double>();
		
		for(int i=0; i<n; i++) {
			numbers[i] = Double.parseDouble(br.readLine());
		}
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			double a , b;
			
			switch(ch) {
			case '-':
				a = cals.pop();
				b = cals.pop();
				cals.push(b-a);
				break;
			case '*':
				a = cals.pop();
				b = cals.pop();
				cals.push(a*b);
				break;
			case '+':
				a = cals.pop();
				b = cals.pop();
				cals.push(a+b);
				break;
			case '/':
				a = cals.pop();
				b = cals.pop();
				cals.push(b/a);
				break;
			default :
				char alpa = 'A';
				int target = ch - alpa;
				cals.push(numbers[target]);
			}
		}
		
		bw.write(String.format("%.2f", cals.pop()));
		
		bw.flush();
		bw.close();
	}
}

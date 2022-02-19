import java.io.*;
import java.util.*;
public class Main_18258 {
	public static void main(String[] args) throws IOException {
	//scanner와 print를 쓸 경우 시간 초과가 발생하니 BufferedReader로 값을 읽어 StringTokenizer	//로 문자열을 쪼갬
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int back = 0;
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch (s) {
			case "push": {
				int x = Integer.parseInt(st.nextToken());
				q.add(x);
				back = x;
				break;
			}
			case "pop": {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(q.poll()).append("\n");
				}
				break;
			}
			case "size": {
				sb.append(q.size()).append("\n");
				break;
			}
			case "empty": {
				if (q.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			}
			case "front": {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(q.peek()).append("\n");
				}
				break;
			}
			case "back": {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(back).append("\n");
				}
				break;
			}
			default:
				break;
			}
		}
		System.out.println(sb);
	}
}
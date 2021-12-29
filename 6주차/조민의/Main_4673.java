package sixweeks;

public class Main_4673 {
	public static void main(String[] args) {
		boolean[] checkbox = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			int tmp = selfnumber(i);
			if (tmp <= 10000)
				checkbox[tmp] = true;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			if (!checkbox[i])
				sb.append(i).append('\n');
		}
		System.out.print(sb);

	}

	//마무리를 못하겠음
}

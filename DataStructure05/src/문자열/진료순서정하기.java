package 문자열;

import java.util.Arrays;

public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] e = {3, 76, 24};
		int[] answer = new int[e.length];
		int[] e2 = Arrays.copyOf(e, e.length);
		Arrays.sort(e2);
		
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e2.length; j++) {
				if (e[i] == e2[j]) {
					answer[j] = e.length-i;
				}
			}
		}

		System.out.println(Arrays.toString(answer));

	}

}

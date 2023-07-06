package 프로그래머스;

import java.util.Arrays;

public class X만큼간격이있는N개의숫자 {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		Solution32 sol = new Solution32();
		long[] result = sol.solution(x, n);
		System.out.println(Arrays.toString(result));
	}

}

class Solution32 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long num = x;
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num;
			num += x;
		}
		return answer;
	}
}

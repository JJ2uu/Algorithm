package 프로그래머스기본;

import java.util.Arrays;

public class 짝수는싫어요 {
	
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int n = 15;
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));
	}
}


class Solution6 {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int count = 0;
        for (int i = 1; i <= n; i++) {
			if (i%2 != 0) {
				answer[count] = i;
				count++;
			}
		}
        return answer;
    }
}
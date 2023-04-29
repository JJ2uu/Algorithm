package 프로그래머스기본;

import java.util.Arrays;

public class 문자반복출력 {
	
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		String my_string = "hello";
		int n = 3;
		String answer = sol.solution(my_string, n);
		System.out.println(answer);
	}
}


class Solution3 {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] s = my_string.split("");
        for (int i = 0; i < my_string.length(); i++) {
//			answer = answer + s[i].repeat(n);
		}
        return answer;
    }
}
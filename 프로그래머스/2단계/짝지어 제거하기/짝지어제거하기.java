package 프로그래머스;

import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "cdcd";
		Solution38 sol = new Solution38();
		int result = sol.solution(s);
		System.out.println(result);
	}

}

class Solution38 {
	public int solution(String s) {
		int answer = -1;
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : arr) {
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
        
		if (stack.isEmpty()) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
}

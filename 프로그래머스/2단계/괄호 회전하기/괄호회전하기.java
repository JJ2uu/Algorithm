package 프로그래머스;

import java.util.Stack;

public class 괄호회전하기 {

	public static void main(String[] args) {
		String s = "{}[]()";
		Solution46 sol = new Solution46();
		int result = sol.solution(s);
		System.out.println(result);
	}

}

class Solution46 {
	public int solution(String s) {
		int answer = 0;
        
		for (int i = 0; i < s.length(); i++) {
			Stack<Character> stack = new Stack<>();
			String str = s.substring(i, s.length()) + s.substring(0, i);
			System.out.println(str);
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (stack.isEmpty()) {
					stack.push(c);
				} else if (stack.peek() == '(' && c == ')') {
					stack.pop();
				} else if (stack.peek() == '{' && c == '}') {
					stack.pop();
				} else if (stack.peek() == '[' && c == ']') {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
			if (stack.isEmpty()) {
				answer++;
			}
		}
		return answer;
	}
}

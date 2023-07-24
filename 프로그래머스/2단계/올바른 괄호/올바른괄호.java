package 프로그래머스;

import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		String s = "()()";
		Solution40 sol = new Solution40();
		boolean result = sol.solution(s);
		System.out.println(result);
	}

}

class Solution40 {
	boolean solution(String s) {
		boolean answer = true;
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				stack.push(arr[i]);
			} else {
				/* arr[i] == ')' 인데 stack 비어있을 경우*/
				if (stack.isEmpty()) {
					return false;
				} else { /* 비어있지 않다면 '('가 존재한다는 뜻 */
					stack.pop();
				}
			}
		}
        
		if (!stack.isEmpty()) {
			answer = false;
		}

		return answer;
	}
}

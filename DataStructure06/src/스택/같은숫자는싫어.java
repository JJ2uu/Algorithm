package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(arr[0]);
		for (int x : arr) {
			if (x != stack.peek()) {
				stack.push(x);
			}
		}
		
		System.out.println(stack);
		
		int[] answer = new int[stack.size()];
		for (int i = answer.length-1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		
		System.out.println(Arrays.toString(answer));
	}

}

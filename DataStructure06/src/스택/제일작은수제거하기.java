package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] n = {4, 3, 2, 1};
		
		Stack<Integer> stack = new Stack<Integer>();
		for (Integer item : n) {
			stack.push(item);
		}
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}

}

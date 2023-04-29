package 스택;

import java.util.Stack;

public class 스택확인_백준 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.peek()); // top 출력
		System.out.println(stack.size());
		System.out.println(stack.empty() ? 1 : 0);
		// 더이상 pop 시도가 안될 때 try-catch를 활용해 -1을 출력
		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch (Exception e) {
			System.out.println(-1);
		}
		System.out.println(stack.size());
		System.out.println(stack.empty() ? 1 : 0);
		
		try {
			System.out.println(stack.pop());
		} catch (Exception e) {
			System.out.println(-1);
		}
		stack.push(3);
		System.out.println(stack.empty() ? 1 : 0);
		System.out.println(stack.peek());

	}

}

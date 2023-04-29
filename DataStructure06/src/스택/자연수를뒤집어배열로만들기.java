package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 자연수를뒤집어배열로만들기 {

	public static void main(String[] args) {
		int n = 12345;
		String[] s = String.valueOf(n).split("");
		
		int[] arr = new int[s.length];
		
		Stack<String> stack = new Stack<String>();
		for (String x : s) {
			stack.push(x);
		}
		
		System.out.println(stack);
		
		for (int i = 0; i < s.length; i++) {
			arr[i] = Integer.parseInt(stack.pop());
		}
		
		System.out.println(Arrays.toString(arr));
	}

}

package 프로그래머스;

import java.util.Arrays;
import java.util.Stack;

public class 뒤에있는큰수찾기 {
	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		int[] arr = {2, 3, 3, 5};
		int[] result = sol.solution(arr);
		System.out.println(Arrays.toString(result));
	}
}

class Solution15 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					answer[i] = numbers[j];
					break;
				} else {
					answer[i] = -1;
				}
			}
		}

		return answer;
	}
    
    public int[] solution2(int[] numbers) {
    	int[] answer = new int[numbers.length];
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = numbers.length - 1; i >= 0; i--) {
			while (!stack.isEmpty()) {
				if (stack.peek() > numbers[i]) {
					answer[i] = stack.peek();
					break;
				} else {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				answer[i] = -1;
			}
			stack.add(numbers[i]);
		}
		System.out.println(stack);
		
		return answer;
	}
}

package 프로그래머스기본;

import java.util.Arrays;

public class 배열자르기 {
	
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		int[] answer = sol.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(answer));
	}
}


class Solution4 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int k = 0;
        for (int i = num1; i <= num2; i++) {
            answer[k] = numbers[i];
            k++;
        }
        return answer;
    }
}
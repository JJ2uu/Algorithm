package 프로그래머스;

import java.util.Arrays;

public class 연속된부분수열의합 {

	public static void main(String[] args) {
		int[] sequence = {1, 2, 3, 4, 5};
		int k = 7;
		Solution22 sol = new Solution22();
		int[] result = sol.solution(sequence, k);
		System.out.println(Arrays.toString(result));
	}

}

class Solution22 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0;
        int right = 0;
        int minRange = Integer.MAX_VALUE;
        int sum = 0;
    	while (true) {
		if (sum > k) {
			sum -= sequence[left];
			left++;
		} else if (right >= sequence.length) {
			break;
		} else {
       		sum += sequence[right++];
        	}
			
		if (sum == k) {
			if(minRange > right-left) {
                   		 minRange = right-left;
                    		answer[0] = left;
                    		answer[1] = right - 1;
                	}
		}
	}
        return answer;
    }
}

package 프로그래머스;

import java.util.Arrays;

public class 이진변환반복하기 {

	public static void main(String[] args) {
		String s = "110010101001";
		Solution29 sol = new Solution29();
		int[] result = sol.solution(s);
		System.out.println(Arrays.toString(result));
	}

}

class Solution29 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int changeCount = 0;
        
        while(!s.equals("1")) {
        	int num = 0;
        	for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					num++;
				} else {
					changeCount++;
				}
			}
        	s = Integer.toBinaryString(num);
        	count++;
        }
        answer[0] = count;
        answer[1] = changeCount;
        
        return answer;
    }
}

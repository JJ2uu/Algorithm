package 문자열;

import java.util.Arrays;


public class 문자열정렬하기 {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		String my_string = "hi12392";
		int[] answer = sol.solution(my_string);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution11 {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        String[] n = my_string.split("");
        
        int[] answer = new int[n.length];
        
        for (int i = 0; i < n.length; i++) {
			answer[i] = Integer.parseInt(n[i]);
		}
        
        Arrays.sort(answer);
        
        return answer;
    }
}

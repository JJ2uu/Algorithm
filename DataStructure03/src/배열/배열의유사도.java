package 배열;

import java.util.Arrays;
import java.util.List;

public class 배열의유사도 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer = sol.solution(s1, s2);
		System.out.println(answer);
	}

}

class Solution8 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list = Arrays.asList(s2);
        
        for (String x : s1) {
			if (list.contains(x)) {
				answer++;
			}
		}
        
        return answer;
    }
}
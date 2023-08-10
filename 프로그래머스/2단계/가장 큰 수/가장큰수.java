package 프로그래머스;

import java.util.Arrays;

public class 가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		Solution48 sol = new Solution48();
		String result = sol.solution(numbers);
		System.out.println(result);
	}
}

class Solution48 {
	public String solution(int[] numbers) {
		String answer = "";
		String[] str = new String[numbers.length];
        
    for (int i = 0; i < str.length; i++) {
			str[i] = Integer.toString(numbers[i]);
		}
        
    Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
    if (str[0].equals("0")) {
			return "0";
		}
        
    for (int i = 0; i < str.length; i++) {
			answer += str[i];
		}
        
    return answer;
  }
}

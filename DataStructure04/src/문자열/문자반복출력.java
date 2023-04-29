package 문자열;


public class 문자반복출력 {
	
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		String my_string = "hello";
		int n = 3;
		String answer = sol.solution(my_string, n);
		System.out.println(answer);
	}
}


class Solution3 {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] c = my_string.toCharArray();
        
        for (char x : c) {
			for (int i = 0; i < n; i++) {
				answer += x;
			}
		}
        
        return answer;
    }
}
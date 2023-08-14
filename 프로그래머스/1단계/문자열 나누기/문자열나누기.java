package 프로그래머스;

public class 문자열나누기 {

	public static void main(String[] args) {
		String s = "abracadabra";
		Solution50 sol = new Solution50();
		int result = sol.solution(s);
		System.out.println(result);
	}

}

class Solution50 {
	public int solution(String s) {
		int answer = 0;
        
    char c = s.charAt(0);
        
    int same = 0;
    int notSame = 0;
        
    for (int i = 0; i < s.length(); i++) {
			if (same == notSame) {
				answer++;
				c = s.charAt(i);
			}
        	
			if (s.charAt(i) == c) {
				same++;
			} else {
				notSame++;
			}
		}
        
    return answer;
  }
}

package 프로그래머스;

public class JadenCase문자열만들기 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		String s = "3people unFollowed me ";
		String result = sol.solution(s);
		System.out.println(result);
	}

}

class Solution8 {
	public String solution(String s) {
		String answer = "";
		String[] arr = s.split(" ");
        
    for (int i = 0; i < arr.length; i++) {
        	// 첫 글자가 공백일 때
			if (arr[i].length() == 0) {
				answer += " ";
			} else {
				answer += arr[i].substring(0, 1).toUpperCase();
				answer += arr[i].substring(1).toLowerCase();
				answer += " ";
			}
		}
    if (s.charAt(s.length()-1) == ' ') {
	    return answer;
		} else {
			answer = answer.substring(0, answer.length()-1);
			return answer;
		}    
  }
}

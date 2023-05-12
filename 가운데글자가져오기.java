package 프로그래머스;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		String s = "qwer";
		String result = sol.solution(s);
		System.out.println(result);
	}

}

class Solution6 {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        System.out.println(len);
        
        if (len%2 == 0) {
			answer = s.substring((len/2)-1, (len/2)+1);
		} else if (len == 1) {
			answer = s;
		} else {
			answer = String.valueOf(s.charAt((len-1)/2));
		}
        return answer;
    }
}

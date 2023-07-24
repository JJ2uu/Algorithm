package 프로그래머스;

public class 하샤드수 {

	public static void main(String[] args) {
		int x = 11;
		Solution39 sol = new Solution39();
		boolean result = sol.solution(x);
		System.out.println(result);
	}

}

class Solution39 {
	public boolean solution(int x) {
		boolean answer = true;
		String s = String.valueOf(x);
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			n += Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		if (x % n == 0) {
			return answer;
		} else {
			answer = false;
		}
        
		return answer;
	}
}

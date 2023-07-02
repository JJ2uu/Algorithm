package 프로그래머스;

public class 삼진법뒤집기 {

	public static void main(String[] args) {
		int n = 45;
		Solution30 sol = new Solution30();
		int result = sol.solution(n);
		System.out.println(result);
	}
}

class Solution30 {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder();
        for (int i = binary.length()-1; i >= 0 ; i--) {
        	sb.append(binary.charAt(i));
		}
        String num = sb.toString();
        answer = Integer.parseInt(num, 3);
        return answer;
    }
}

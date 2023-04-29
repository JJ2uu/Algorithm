package 배열;

public class 자릿수더하기 {
	
	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		int n = 1234;
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}


class Solution9 {
    public int solution(int n) {
        int answer = 0;
        String n2 = String.valueOf(n);
        String[] n3 =n2.split("");
        for (String x : n3) {
			answer += Integer.parseInt(x);
		} 
        return answer;
    }
}
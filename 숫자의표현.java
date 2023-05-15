package 프로그래머스;

public class 숫자의표현 {

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		int n = 15;
		int result = sol.solution(n);
		System.out.println(result);
	}

}

class Solution13 {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) {
				sum += j;
				if (sum == n) {
					answer++;
					break;
				} else if (sum > n) {
					break;
				}
			}
		}
        return answer;
    }
}

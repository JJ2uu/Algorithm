package 프로그래머스;

public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		Solution5 sol = new Solution5();
		int result = sol.solution(left, right);
		System.out.println(result);
	}

}

class Solution5 {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= right; j++) {
				if (i%j == 0) {
					count++;
				}
			}
			if (count%2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}
        return answer;
    }
}

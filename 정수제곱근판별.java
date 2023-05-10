package 프로그래머스;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		long n = 121;
		long result = sol.solution(n);
		System.out.println(result);
	}

}
class Solution4 {
    public long solution(long n) {
        long answer = 0;
        long b = (long)Math.sqrt(n);
        if (n % b == 0) {
        	long num = (long) ((b+1)*(b+1));
			answer = num;
		} else {
			answer = -1;
		}

        return answer;
    }
}

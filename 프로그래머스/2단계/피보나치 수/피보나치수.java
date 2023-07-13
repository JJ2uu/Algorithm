package 프로그래머스;

public class 피보나치수 {

	public static void main(String[] args) {
		int n = 1500;
		Solution34 sol = new Solution34();
		int result = sol.solution(n);
		System.out.println(result);
	}

}

class Solution34 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
			if (i == 0) {
				arr[i] = 0;
			} else if (i == 1) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i-1]% 1234567 + arr[i-2]% 1234567;
			}
		}
        
        answer = (arr[n -1] + arr[n-2]) % 1234567;
        
        return answer;
    }
}

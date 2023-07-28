package 프로그래머스;

public class 소수찾기 {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		int n = 10;
		int result = sol.solution(n);
		System.out.println(result);
	}

}

class Solution7 {
	public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
        	if (number(i)) {
				answer++;
			}
		}
        return answer;
    }
    
    public boolean number(int num) {
    	boolean check = true;
    	for (int l = 2; l <= Math.sqrt(num); l++) {
			if (num % l == 0) {
				check = false;
				break;
			}
		}
    	return check;
	}

}

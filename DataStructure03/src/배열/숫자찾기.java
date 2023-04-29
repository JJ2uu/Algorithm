package 배열;

public class 숫자찾기 {
	
	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		int num = 29183;
		int k = 1;
		int answer = sol.solution(num, k);
		System.out.println(answer);
	}
}


class Solution10 {
    public int solution(int num, int k) {
        int answer = 0;
        String n = String.valueOf(num);
        String k2 = String.valueOf(k);
        
        if (n.contains(k2)) {
			answer = n.indexOf(k2) + 1;
		} else {
			answer = -1;
		}
        
        return answer;
    }
}
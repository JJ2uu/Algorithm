package 프로그래머스;

public class 콜라츠추측 {

	public static void main(String[] args) {
		int num = 626331;
		Solution47 sol = new Solution47();
		int result = sol.solution(num);
		System.out.println(result);
	}

}

class Solution47 {
    public int solution(long num) {
        int answer = 0;
        
        while(num != 1) {
        	if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}
        	answer++;
        	
        	if (answer == 500) {
				answer = -1;
				break;
			}
        }
        return answer;
    }
}

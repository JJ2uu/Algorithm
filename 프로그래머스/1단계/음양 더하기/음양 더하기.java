public class 음양더하기 {

	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		Solution27 sol = new Solution27();
		int answer = sol.solution(absolutes, signs);
		System.out.println(answer);
	}

}

class Solution27 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
			if (signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
        return answer;
    }
}

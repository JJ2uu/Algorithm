package 프로그래머스기본;

public class 배열의유사도 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer = sol.solution(s1, s2);
		System.out.println(answer);
	}

}

class Solution8 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i=0; i<s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}
			}
        }
        return answer;
    }
}
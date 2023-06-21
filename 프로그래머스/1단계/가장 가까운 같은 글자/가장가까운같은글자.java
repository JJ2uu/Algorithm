package 프로그래머스;

import java.util.Arrays;

public class 가장가까운같은글자 {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		String s = "foobar";
		System.out.println(s.substring(0, 5));
		System.out.println(s.lastIndexOf("o"));
		int[] result = sol.solution(s);
		System.out.println(Arrays.toString(result));
	}

}

class Solution2 {
    public int[] solution(String s) {
    	// 배열 생성
        int[] answer = new int[s.length()];
        
        // 뒤에서부터 저장
        for (int i = answer.length-1; i >= 0; i--) {
        	// 맨 뒷글자 s2 변수에 저장
        	String s2 = Character.toString(s.charAt(i));
        	// 맨 뒷글자 s2를 제외한 나머지 글자에 s2가 포함되어 있을 때
        	if ((s.substring(0, i)).contains(s2)) {
        		// 기존 i 값에서 마지막으로 포함되어 있는 s2의 index 값을 빼준 후 answer에 저장 => 몇 번째 앞에 있는지 확인하기 위해
				answer[i] = i-s.substring(0, i).lastIndexOf(s2);
			} else {
				answer[i] = -1;
			}
		}
        return answer;
    }
}

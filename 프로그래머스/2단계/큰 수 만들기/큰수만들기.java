package 프로그래머스;

public class 큰수만들기 {

	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		Solution24 sol = new Solution24();
		String result = sol.solution(number, k);
		System.out.println(result);
	}

}

class Solution {
    public String solution(String number, int k) {
    	String answer = "";
        StringBuilder sb = new StringBuilder();
        // 선택해야 할 숫자의 개수
        int length = number.length()-k;
        // 시작 인덱스
        int index = 0;
        for (int i = 0; i < length; i++) {
        	// 가장 큰 수 저장
			char max = 0;
			// 현재 탐색 범위
			for (int j = index; j <= i + k; j++) {
				char tmp = number.charAt(j);
				if (max < tmp) {
					max = tmp;
					// 새로운 탐색 범위 설정
					index = j + 1;
				}
			}
			sb.append(max);
		}
        answer = sb.toString();
        return answer;
    }
}

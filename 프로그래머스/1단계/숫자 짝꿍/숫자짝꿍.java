package 프로그래머스;

import java.util.Arrays;

public class 숫자짝꿍 {

	public static void main(String[] args) {
		String X = "100";
		String Y = "203045";
		Solution37 sol = new Solution37();
		String result = sol.solution(X, Y);
		System.out.println(result);
	}

}

class Solution37 {
	public String solution(String X, String Y) {
		String answer = "";
        
		StringBuilder sb = new StringBuilder();

		String[] xArr = X.split("");
    String[] yArr = Y.split("");
        
    /* 작은 값부터 비교하기 위해서 정렬 */
    Arrays.sort(xArr);
    Arrays.sort(yArr);
        
		int x = 0;
		int y = 0;
        
		/* 각 index가 배열의 길이를 넘어가지 않을 때까지 반복 */
		while (x < xArr.length && y < yArr.length) {
			if (xArr[x].equals(yArr[y])) {
				sb.append(xArr[x]);
				x++;
				y++;
			} else if (Integer.parseInt(xArr[x]) < Integer.parseInt(yArr[y])) { /* x가 작을 때 */
				x++;
			} else { /* y가 작을 때 */
				y++;
			}
		}
        
		/* 같은 숫자가 없을 때 */
		if (sb.length() < 1) {
			return "-1";
		}
        
		/* 작은 값부터 정렬했기 때문에 reverse를 해주어 최대값으로 변경 */
		sb.reverse();
		answer = sb.toString();
        
		/* 첫 글자가 0일 경우, 같은 숫자가 0일 경우 */
		if (answer.charAt(0) == '0') {
			return "0";
		}
        
		return answer;
	}
}

package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class 나머지가1이되는수찾기 {

	public static void main(String[] args) {
		int n = 10;
		Solution43 sol = new Solution43();
		int result = sol.solution(n);
		System.out.println(result);
	}

}

class Solution43 {
	public int solution(int n) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			if (n%i == 1) {
				list.add(i);
			}
		}
		Collections.sort(list);
		answer = list.get(0);
		return answer;
	}
}

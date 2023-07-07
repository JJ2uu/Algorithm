package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class 최대값과최솟값 {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		Solution33 sol = new Solution33();
		String result = sol.solution(s);
		System.out.println(result);
	}

}

class Solution33 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			list.add(num);
		}
        Collections.sort(list);
        answer = list.get(0) + " " + list.get(list.size()-1);
        return answer;
    }
}
